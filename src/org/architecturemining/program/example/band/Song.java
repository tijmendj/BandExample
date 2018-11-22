package org.architecturemining.program.example.band;

public class Song {
	private int tempo;
	private String name;

	/**
	 * @param tempo
	 * @param name
	 * @param music
	 */
	public Song(int tempo, String name) {
		this.tempo = tempo;
		this.name = name;
	}

	public String getLyrics() {
		if (name == "Despacito") {
			return "Deeespaaciiitoo, something something something Puerto Rico";
		} else if (name == "Master of Puppets") {
			return "Master of puppets is pulling your strings!";
		} else {
			return "Lalalalala, this is " + name;
		}
	}

	public String getName() {
		return name;
	}

	public int getTempo() {
		return tempo;
	}

}
