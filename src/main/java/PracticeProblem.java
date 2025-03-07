import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeProblem {
	private static String strResult = "";
	private static int[] numResult = {-1, -1};
	private static final int RESULT_AGE_INDEX = 0;
	private static final int RESULT_NUMBER_INDEX = 1;
	private static final int FIRST_NAME_INDEX = 0;
	private static final int LAST_NAME_INDEX = 1;
	private static final int AGE_INDEX = 2;
	private static final int NUMBER_INDEX = 3;
	private static final int LINE_LOWER_BOUND = 1;
	private static final int LINE_UPPER_BOUND = 3;
	public static void main(String args[]) {
		
	}

	public static String getName(int line, String file) {
		generalFileReader(line, file, false);
		return strResult;
	}

	public static int getAge(int line, String file) {
		generalFileReader(line, file, true);
		return numResult[RESULT_AGE_INDEX];
	}

	public static int getNumber(int line, String file) {
		generalFileReader(line, file, true);
		return numResult[RESULT_NUMBER_INDEX];
	}

	public static void fileAppend(String output, String filename) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(filename, true));
			writer.write(output);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

	public static void generalFileReader(int line, String file, boolean isInt) {
		BufferedReader reader = null;
		if (line < LINE_LOWER_BOUND || line > LINE_UPPER_BOUND) {
			if (isInt) {
				numResult[RESULT_AGE_INDEX] = -1;
				numResult[RESULT_NUMBER_INDEX] = -1;
			} else {
				strResult = "";
			}
			return;
		}
		try {
			reader = new BufferedReader(new FileReader(file));
			for (int i = 0; i < line - 1; i++) {
				reader.readLine();
			}
			String[] currLine = reader.readLine().split(" ");
			if (isInt) {
				numResult[RESULT_AGE_INDEX] = Integer.parseInt(currLine[AGE_INDEX]);
				numResult[RESULT_NUMBER_INDEX] = Integer.parseInt(currLine[NUMBER_INDEX]);
			} else {
				strResult = currLine[FIRST_NAME_INDEX] + " " + currLine[LAST_NAME_INDEX];
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
