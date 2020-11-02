package digraph;

import java.util.*;

public class NodesCreator {
	public Map<String, Collection<String>> GroupByPreviousWord(List<String> words){
		Map<String, Collection<String>> groups = new TreeMap<>();

		// walks through the array until last but one position
		// because the last word does not have another word after it
		// this would give an error and is not necessary,
		// given we want to get the words after another word
		for (int i=0; i < words.size()-1; i++){
			String firstWord = words.get(i);
			String secondWord = words.get(i+1);

			if (!groups.containsKey(firstWord))
				groups.put(firstWord, new ArrayList<>());

			Collection<String> nextWords = groups.get(firstWord);

			if (!nextWords.contains(secondWord))
				nextWords.add(secondWord);
		}

		return groups;
	}
}
