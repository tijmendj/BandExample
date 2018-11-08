package org.architecturemining.program.example.band;

import java.util.List;
import java.util.Set;

public class Band {
	private List<Song> knownSongs;
	private Set<BandMember> members;

	/**
	 * @param knownSongs
	 * @param members
	 */
	public Band(List<Song> knownSongs, Set<BandMember> members) {
		super();
		this.knownSongs = knownSongs;
		this.members = members;
	}

	public void practice() {
		for (Song song : knownSongs) {
			System.out.println("Next song: " + song.getName());
			for (BandMember bandmember : members) {
				bandmember.play(song);
			}
		}
	}

}
