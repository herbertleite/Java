package application;

import java.util.HashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
	}
}

/*
add(obj), remove(obj), contains(obj) � Baseado em equals e hashCode
� Se equals e hashCode n�o existir, � usada compara��o de ponteiros
� clear()
� size()
� removeIf(predicate)
� addAll(other) - uni�o: adiciona no conjunto os elementos do outro conjunto, sem repeti��o
� retainAll(other) - interse��o: remove do conjunto os elementos n�o contitos em other
� removeAll(other) - diferen�a: remove do conjunto os elementos contidos em other
*/