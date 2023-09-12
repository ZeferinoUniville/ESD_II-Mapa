import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapaTest {
    @Test
    public void testPutAndGet() {
        Mapa<String, Integer> mapa = new Mapa<>();
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);

        assertEquals(1, mapa.get("um"));
        assertEquals(2, mapa.get("dois"));
        assertEquals(3, mapa.get("três"));
        assertNull(mapa.get("quatro"));
    }

    @Test
    public void testRemove() {
        Mapa<String, Integer> mapa = new Mapa<>();
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);

        mapa.remove("dois");
        assertNull(mapa.get("dois"));
        assertEquals(2, mapa.size());

        mapa.remove("um");
        assertNull(mapa.get("um"));
        assertEquals(1, mapa.size());

        mapa.remove("quatro"); // Chave inexistente, não deve gerar erro
        assertEquals(1, mapa.size());
    }

    @Test
    public void testContainsKey() {
        Mapa<String, Integer> mapa = new Mapa<>();
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);

        assertTrue(mapa.containsKey("um"));
        assertTrue(mapa.containsKey("dois"));
        assertFalse(mapa.containsKey("quatro"));
    }

    @Test
    public void testSize() {
        Mapa<String, Integer> mapa = new Mapa<>();
        assertEquals(0, mapa.size());

        mapa.put("um", 1);
        assertEquals(1, mapa.size());

        mapa.put("dois", 2);
        assertEquals(2, mapa.size());

        mapa.remove("um");
        assertEquals(1, mapa.size());
    }
}
