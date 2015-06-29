package ltl.example;

import gov.nasa.ltl.trans.Formula;
import gov.nasa.ltl.trans.ParseErrorException;

public class HelloLTL {
	public static void main(String[] args) {
		String[] formulas = {
		                     "p",
		                     "!p",
		                     "p /\\ q",
		                     "p \\/ q",
		                     "p -> q",
		                     "[] p",
		                     "<> p",
		                     "X p",
		                     "p U q",
		                     "p W q",
		                     "p V q",
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
		                     "( X p ) \\/ ( [] <> q )"
							};
		for (String f : formulas) {
			try {
				System.out.println(f);
				Formula.parse(f);
			} catch (ParseErrorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}