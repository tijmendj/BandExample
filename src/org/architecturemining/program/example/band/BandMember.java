package org.architecturemining.program.example.band;

import java.util.Map;

import org.architecturemining.program.example.band.instruments.Drums;
import org.architecturemining.program.example.band.instruments.Instrument;

public class BandMember {
	private Map<String, Instrument> instruments;

	/**
	 * @param name
	 * @param instruments
	 */
	public BandMember(Map<String, Instrument> instruments) {
		super();
		this.instruments = instruments;
	}

	public void play(Song song) {
		// The drummer has to count down before everyone can start playing
		if (isDrummer()) {
			((Drums) instruments.get("Drums")).countDown();
		}
		// Wait one measure before we start playing
		try {
			Thread.sleep(1 / ((song.getTempo() / 60)) * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (Instrument i : instruments.values()) {
			i.makeMusic(song);
		}
	}

	private boolean isDrummer() {
		// We don't do any type checking, if someone says the can play drums
		// we trust them to tell the truth
		if (instruments.containsKey("Drums")) {
			return true;
		}
		return false;
	}

}
