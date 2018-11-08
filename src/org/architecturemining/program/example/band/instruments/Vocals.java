package org.architecturemining.program.example.band.instruments;

import org.architecturemining.program.example.band.Song;

public class Vocals implements Instrument {

	@Override
	public void makeMusic(Song song) {
		System.out.println("Dun dun dun dududun dun"); // They're under pressure
	}

}
