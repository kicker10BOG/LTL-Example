package ltl.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gov.nasa.ltl.trans.Formula;
import gov.nasa.ltl.trans.ParseErrorException;

public class HelloLTL {
	public static void main(String[] args) {
		String[] formulas = {
		                     "p",	// p
		                     "!p",	// NOT p
		                     "p /\\ q", // p /\ q ... p AND q
		                     "p \\/ q", // p \/ q ... p OR q
		                     "program -> quick",	// program IMPLIES quick
		                     "[] program",	// ALWAYS program
		                     "<> program",	// 	EVENTUALLY program
		                     "X program",	// NEXT program
		                     "program U quiet",	// program UNTIL quiet
		                     "p W q",	// p WEAK UNTIL q
		                     "p V q",	// p RELEASE q
		                     "p M q",	// p WEAK RELEASE q
		                     /* You get the idea */
		                     "( X p ) U ( X q )",	
		                     "X ( p U q )",
		                     "( p V q ) /\\ ( p V r )",
		                     "p V ( q /\\ r )",
		                     "( p V r ) \\/ ( q V r )",
		                     "( p \\/ q ) V r",
		                     "( X p ) /\\ ( X q )",
		                     "X ( p /\\ q )",
		                     "X true",
		                     "true",
		                     "p U false",
		                     "false",
		                     "[] <> p \\/ [] <> q",
		                     "[] <> ( p \\/ q )",
		                     "<> X p",
		                     "X <> p",
		                     "[] [] <> p",
		                     "[] <> p",
		                     "<> [] <> p",
		                     "[] <> p",
		                     "X [] <> p",
		                     "[] <> p",
		                     "<> ( p /\\ [] <> q )",
		                     "( <> p ) /\\ ( [] <> q )",
		                     "[] ( p \\/ [] <> q )",
		                     "( [] p ) \\/ ( [] <> q )",
		                     "X ( p /\\ [] <> q )",
		                     "( X p ) /\\ ( [] <> q )",
		                     "X ( p \\/ [] <> q )",
		                     "( X p ) \\/ ( [] <> q )",
		                     "(p /\\ q) \\/ (p /\\ r)"
							};
		for (String f : formulas) {
			try {
				System.out.println(f);
				Formula.parse(f);
				String[] predicates = Formula.getPredicates(f);
				for (String p : predicates) {
					System.out.println("->"+p);
				}
				System.out.println();
			} catch (ParseErrorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}