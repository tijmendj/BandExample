package org.architecturemining.program.example.band.instruments;

import org.architecturemining.program.example.band.Song;

public class Bass implements Instrument {

	@Override
	public void makeMusic(Song song) {
		System.out.println(song.getLyrics());
	}

}
