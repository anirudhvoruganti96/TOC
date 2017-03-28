package CP;

/*
 * Group members :
 * Anirudh Voruganti (1410110056)
 * Krishna Sai Pallela (1410110204)
 * Nitish Bharadwaj (1410110271)
 * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PatternMatching {

	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out) {
		
		System.out.println("Enter the pattern:");
		String pattern=s1.next();
		System.out.println("Enter the text/string: ");
		String text=s1.next();
		if(pattern.length()>text.length())
		{
			System.out.println("pattern doesn't exist");
		}
		int pointer=0,k=0,ctr=0,i=0;
		pointer=k;
		while(k<text.length())
		{
			i=0;
		while(i<pattern.length())
		{
			if(pattern.charAt(i)==text.charAt(k))
			{
				if(k<text.length())
				{
					k++;
					ctr++;
				}
				else 
				{
					out.println("k "+k+" lenght "+text.length());
					out.println("Pattern doesn't exist ");
				}
			 i++;	
			}
			
			else 
			{
				k++;
				pointer=k;
				i=0;
				ctr=0;
			}
		}
		
		if(ctr==pattern.length())
		{
			ctr=0;
			out.println(pointer+" shift is required to find the pattern");
			pointer=k;
		}

		}
	}
	/************************ SOLUTION ENDS HERE ************************/

	
	/************************ TEMPLATE STARTS HERE ************************/

	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(System.out)), false);
		solve(in, out);
		in.close();
		out.close();
	}

	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer st;

		public FastScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			st = null;
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String line = reader.readLine();
					if (line == null)
						return null;
					st = new StringTokenizer(line);
				} catch (Exception e) {
					throw (new RuntimeException());
				}
			}
			return st.nextToken();
		}

		public String nextLine() {
			String str = null;
			try {
				str = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		//int arr[] = s1.nextIntArray(len);
		long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		public void close() {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/************************ TEMPLATE ENDS HERE ************************/
}
