package week3day2;

public class Removeduplicates {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] words = text.split(" ");

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals(" ")) {
					words[j] = " ";
					count++;
				}
			}

		}

		if (count > 0) {

			System.out.print(" Text after Removing Duplicates: ");

			for (String w:words) {
				System.out.print(w+" ");
			}
		}

	}

}
