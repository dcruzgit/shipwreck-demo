package mx.com.arttech.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mx.com.arttech.demo.model.Shipwreck;

public class ShipwreckStub {
	private static Map<Long, Shipwreck> wrecks = new HashMap<Long, Shipwreck>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		Shipwreck a = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
		wrecks.put(1L, a);
		Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
		wrecks.put(2L, b);
		Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
		wrecks.put(3L, c);
		Shipwreck d = new Shipwreck(3L, "HMS Basilisk", "A B-class destroyer that was sunk by German bombers off Koksijde.", "GOOD", 20, 15.12, 128.44, 2010);
		wrecks.put(4L, d);
		Shipwreck e = new Shipwreck(3L, "USS Discovery", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 46, 23.12, 138.44, 2005);
		wrecks.put(5L, e);
		Shipwreck f = new Shipwreck(3L, "SMS Seeadler", "A Type IIB U-boat that was scuttled at Wilhelmshaven.", "FAIR", 30, 56.12, 188.44, 1991);
		wrecks.put(6L, f);
		Shipwreck g = new Shipwreck(3L, "HMS Niger", "A Halcyon-class minesweeper that was sunk by a mine off the Westfjords.", "GOOD", 15, 56.99, 141.14, 1942);
		wrecks.put(7L, g);
	}

	public static List<Shipwreck> list() {
		return new ArrayList<Shipwreck>(wrecks.values());
	}

	public static Shipwreck create(Shipwreck wreck) {
		idIndex += idIndex;
		wreck.setId(idIndex);
		wrecks.put(idIndex, wreck);
		return wreck;
	}

	public static Shipwreck get(Long id) {
		return wrecks.get(id);
	}

	public static Shipwreck update(Long id, Shipwreck wreck) {
		wrecks.put(id, wreck);
		return wreck;
	}

	public static Shipwreck delete(Long id) {
		return wrecks.remove(id);
	}
}
