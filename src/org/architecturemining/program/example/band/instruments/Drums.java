package org.architecturemining.program.example.band.instruments;

import org.architecturemining.program.example.band.Song;

public class Drums implements Instrument {

	@Override
	public void makeMusic(Song song) {
		// Nobody said they were a particularly good band
		System.out.println("Boom tish boom tish boom tish");
	}

	public void countDown() {
		System.out.println("Tick tick tick tick");
	}

}
