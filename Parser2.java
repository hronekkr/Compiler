import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
	
public class Parser2 {
		
		static int i=0;
		static int tok;
		final static char IDR = 1;
		final static char CONST = 2;
		final static char KWRD = 3;
		final static char KWWR = 4;
		final static char KWIF = 5;
		final static char KWTH = 6;
		final static char KWEL = 7;
		final static char KWFI = 8;
		final static char KWTO = 9;
		final static char KWDO = 10;
		final static char KWENDL = 11;
		final static char SEMI = 12;
		final static char COMMA = 13;
		final static char ASGN = 14;
		final static char PLUS = 15;
		final static char MINUS = 16;
		final static char STAR = 17;
		final static char DVD = 18;
		final static char EQR = 19;
		final static char GTR = 20;
		final static char LTR = 21;
		final static char LER = 22;
		final static char GER = 23;
		final static char NER = 24;
		final static char LPAR = 25;
		final static char RPAR = 26;
		final static char QUT = 27;
		final static char KWDECLARE = 28;
		final static char KWINTEGER = 29;
		final static char KWEDECLARE = 30;
		
		static int file;
		static char[] ch = {'0','1','2','3','4','5','6','7','8','9',' '};
		public static void main(String[] args) throws IOException 
		{//C:\Users\Branches\Documents\Computer Science II\WorkSpace\Senior Seminar
			Cfile = new Scanner(new File("/Users/Katelyn/Documents/workspace/Compiler/Second.txt"));
			//writer = new PrintWriter("/Users/Branches/Desktop/Final.txt", "UTF-8");
			//int rFile = scan();
			//tok=scan();
			program();
			System.out.println("Done");
		}
		public static void condst() throws IOException//constant = digit, { digit } ;
		{
			
			tok = scan();
			expr();
			if(tok != GER && tok != GTR && tok != LER && tok != LTR && tok != NER && tok != EQR)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			expr();
			print(tok);
			log(tok);
			if(tok != KWTH)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			stgroup();
			print(tok);
			log(tok);
			if(tok == KWEL)
				print(tok);
				log(tok);
				
				tok = scan();
				stgroup();
				print(tok);
				log(tok);
			if(tok != KWFI)
				{
				halt();	
				}
			print(tok);
			log(tok);
			
			tok = scan();
		}
		public static void readst() throws IOException//read = "read", identifier list ;
		{
			
			tok = scan();
			print(tok);
			log(tok);
			idlist();
		}
		public void writest() throws IOException//write = "write", output list ;
		{
			
			tok = scan();
			print(tok);
			log(tok);
			outlist();
		}
		
		public static void word() throws IOException//word = { (letter | digit) }, ( letter | digit ) ;
		{
			
			tok = scan();
			if(tok != IDR && tok != CONST)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
		}
		public static void outlist() throws IOException//output list = { (expr | quote), "," }, ( expr | quote ) ;
		{
			
			tok = scan();
			if(tok != COMMA)
				{
				halt();
				}
				print(tok);
				log(tok);
			
			tok = scan();
			if(tok == COMMA)
				print(tok);
				log(tok);
				tok = scan();
				expr();
		}
		public static void constant() throws IOException//constant = digit, { digit } ;
		{
			
			tok = scan();
			if(tok != CONST && tok != MINUS)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			print(tok);
			log(tok);
			tok = scan();
			asgn();
		}
		public static void loopst() throws IOException//loop = "to", expr, "loop", st group, "endloop" ;
		{
			
			tok = scan();
			expr();
			print(tok);
			log(tok);
			if(tok != KWDO)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			stgroup();
			print(tok);
			log(tok);
			if(tok != KWENDL)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
		}
		public static void expr() throws IOException //expr = term, { ( "+" | "-" ), term } ;
		{
			
			tok = scan();
			print(tok);
			log(tok);
			term();
			print(tok);
			log(tok);
			if(tok!=PLUS|tok!=MINUS)
				{
				halt();
				}
			print(tok);
			log(tok);
		}
		public static void term() throws IOException //term = { ( "*" | "/" ) } ;
		{
			
			tok = scan();
			print(tok);
			log(tok);
			if(tok!=STAR|tok!=DVD)
				{
				halt();
				}
			print(tok);
			log(tok);
			
		}
		public static void asgn() throws IOException//asgn = identifier, ":=", expr ;
		{
			
			tok = scan();
			print(tok);
			log(tok);
			if(tok != ASGN)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			expr();
			print(tok);
			log(tok);
		}
		public static void program() throws IOException //program = [ decl part ], st group, "##" ;
		{
			
			tok = scan();
			System.out.println(scan());
			System.out.println(tok);
			if(tok != IDR && tok != KWIF && tok != KWTO && tok != KWRD && tok != KWWR && tok != KWDECLARE)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			if(tok == IDR | tok == KWIF | tok == KWTO | tok == KWRD | tok == KWWR)
				print(tok);
				log(tok);
				stgroup();
				constant();
				print(tok);
				log(tok);
				
				tok = scan();
			if(tok == KWDECLARE)
			{
				print(tok);
				log(tok);
			}
				declpart();
				print(tok);
				log(tok);
				
				tok = scan();
			if(tok == NER)
			{
				tok = scan();
				return;
			}
			
		}
		public static void declpart() throws IOException //decl part = [ { decl, ";" } ], decl, ";" ;
		{
			print(tok);
			tok = scan();
			print(tok);
			if(tok != KWINTEGER)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			idlist();
			print(tok);
			log(tok);
			if(tok == SEMI)
			{
				print(tok);
				log(tok);
				
				tok = scan();
				idlist();
			}
			
			tok = scan();
			if(tok != KWEDECLARE)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			
		}
		public static void idlist() throws IOException //identifier list = { identifier, "," }, identifier ;
		{
			
			tok = scan();
			if(tok !=1)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			if(tok == COMMA)
				print(tok);
				log(tok);
				id();
		}
		public static void id() throws IOException //identifier = letter, [ { (letter | digit) } ] ;
		{
			
			tok = scan();
			if(tok != IDR && tok != CONST)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			
		}
		public static void stgroup() throws IOException //st group = { st, ";" }, st ;
		{
			
			tok = scan();
			if(tok != IDR && tok != KWIF && tok != KWTO && tok != KWRD)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			while(tok == SEMI)
				
			print(tok);
			log(tok);
				tok = scan();
				if(tok != IDR && tok != KWIF && tok != KWTO && tok != KWRD)
					{
					halt();
					}
				print(tok);
				log(tok);
			
		}
		public static void quote() throws IOException//quote = "'", word, "'" ;
		{
			
			tok = scan();
			if(tok != QUT)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			word();
			print(tok);
			log(tok);
			if(tok != CONST && tok != IDR)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
			if(tok != QUT)
				{
				halt();
				}
			print(tok);
			log(tok);
			
			tok = scan();
		}
		public static String halt() 
		{
			return("Error");
		}
		public static int scan() throws IOException
		{
			if (Cfile.hasNextInt())
			{
	            current = Cfile.nextInt();
			}
			return current;
			
		}
		
		public static int current;
		public static Scanner Cfile;
		//public static PrintWriter writer;
		public static void log(int message) throws IOException 
		{ 
		      PrintWriter out = new PrintWriter(new FileWriter("Final.txt", true), true);
		      out.write(message+" ");
		      out.close();
		}
		public static void print(int letters)
		{
			System.out.println(letters);
		}
	}



