package org.architecturemining.program.example.band;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.architecturemining.program.example.band.instruments.Bass;
import org.architecturemining.program.example.band.instruments.Drums;
import org.architecturemining.program.example.band.instruments.Instrument;
import org.architecturemining.program.example.band.instruments.Vocals;

public class BandPractice {

	public static void main(String[] args) {
		// This code serves as the origin story of The Placeholders.
		// It's a rather short and uneventful biography.
		ArrayList<Song> songs = new ArrayList<>();
		// For brevity we assume that everyone knows the songs, and they don't need to
		// learn the music
		songs.add(new Song(80, "The Ballad of Null"));
		songs.add(new Song(89, "Despacito")); // They do covers as well
		songs.add(new Song(220, "Master of Puppets")); // Very diverse repertoire

		HashSet<BandMember> bandmembers = new HashSet<>();

		HashMap<String, Instrument> aliceInstruments = new HashMap<>();
		aliceInstruments.put("Drums", new Drums());

		bandmembers.add(new BandMember(aliceInstruments));

		HashMap<String, Instrument> bobInstruments = new HashMap<>();
		aliceInstruments.put("Bass", new Bass());
		aliceInstruments.put("Vocals", new Vocals());

		bandmembers.add(new BandMember(bobInstruments));

		Band thePlaceholders = new Band(songs, bandmembers);

		thePlaceholders.practice();

		System.out.println("Band practice is over");
	}

}
