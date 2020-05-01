package com;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {

	public static Sim[] transferCircle(Sim sim[], String s, String s1) {
		Sim si[] = new Sim[0];
		for (int i = 0; i < sim.length; i++) {
			if (s.equals(sim[i].getCircle())) {
				si = Arrays.copyOf(si, si.length + 1);
				sim[i].setCircle(s1);
				si[si.length - 1] = sim[i];
			}
		}
		for (int i = 0; i < si.length; i++) {
			for (int j = i + 1; j < si.length; j++) {
				if (si[i].getRatePerSecond() < si[j].getRatePerSecond()) {
					Sim temp = si[i];
					si[i] = si[j];
					si[j] = temp;
				}
			}
		}

		return si;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Sim sim[] = new Sim[n];
		for (int i = 0; i < n; i++) {
			sim[i] = new Sim(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
		}
		String c = sc.next();
		String c1 = sc.next();
		Sim s[] = Solution1.transferCircle(sim, c, c1);
		for (Sim i : s) {
			System.out.println(
					i.getSimId() + " " + i.getCustomerName() + " " + i.getCircle() + " " + i.getRatePerSecond());
		}
		sc.close();
	}

}
