package March14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import March9.main;

public class Eight {
	public static void main(String[] args) {
		int num = 371;
		int duplicate = num;
		int cause = num;
		int count = 0;
		int finalans = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}

		while (duplicate > 0) {
			double res = duplicate % 10;
			res = Math.pow(res, count);
			finalans = (int) (finalans + res);

			duplicate = duplicate / 10;
		}
		if (finalans == cause) {
			System.out.println("its an amstrong num");
		} else {
			System.out.println("not");
		}
	}
}
