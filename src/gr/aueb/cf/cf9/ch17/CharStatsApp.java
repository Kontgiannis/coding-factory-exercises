package gr.aueb.cf.cf9.ch17;

import java.util.*;
import java.io.*;

/**
 * Reads per char on a .txt inserts em in a double linked list
 * returns stats for 'em ordered by
 * 1) frequency of appearance
 * 2) percentage descending
 */

public class CharStatsApp {
    public static void main(String[] args) {
        String path = "C:\\tmp\\locations.txt";
        LinkedList<Character> chars = new LinkedList<>();
        Map<Character, Integer> freq = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\tmp\\locations.txt"))) {
            int x;
            while ((x = br.read()) != -1) {
                char c = (char) x;
                if (c == '\n' || c == '\r') continue;
                if (Character.isWhitespace(c)) continue;
                chars.add(c);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }catch(IOException e) {
            System.out.println("Error reading file" + e.getMessage());
            return;
        }
        int size = chars.size();
        if (size == 0){
            System.out.println("Empty file");
            return;
        }
        // print stats for char freq of appereance asc
        System.out.println("--- Sorted  by  character ( asc) ----");
        TreeMap<Character, Integer> sortedByChar = new TreeMap<>(freq);
        printStats(sortedByChar.entrySet(), size);

        // print stats sorted by percentage freq (dsc)
        System.out.println("Sorted  by percentage freq (dsc) ----");
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a,b) -> {
            int comp = Integer.compare(b.getValue(), a.getValue());
            if (comp != 0) return comp;
            return Character.compare(a.getKey(), b.getKey());
        });
        printStats(entries, size);
    }
    private static void printStats(Iterable<Map.Entry<Character, Integer>> entries, int total) {
        for (Map.Entry<Character, Integer> e : entries) {
            char ch = e.getKey();
            int count = e.getValue();
            double pct = (count * 100.0) / total;
            System.out.printf("%-6s count=%-6d pct=%6.2f%%%n" ,
                    prettyChar(ch), count, pct);
        }
    }
    private static String prettyChar(char c) {
        switch(c) {
            case '\n': return "\\n";
            case '\r': return "\\r";
            case '\t': return "\\t";
            case '\\': return "\\\\";
            case ' ': return "' '";
            default: return String.valueOf(c);
        }
    }
}
