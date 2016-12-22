import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

	
public class Scanner2 {

		public static void main(String[] args) throws Exception
		{
			final int IDR = 1;
			final int CONST = 2;
			final int KWRD = 3;
			final int KWWR = 4;
			final int KWIF = 5;
			final int KWTH = 6;
			final int KWEL = 7;
			final int KWFI = 8;
			final int KWTO = 9;
			final int KWDO = 10;
			final int KWENDL = 11;
			final int SEMI = 12;
			final int COMMA = 13;
			final int ASGN = 14;
			final int PLUS = 15;
			final int MINUS = 16;
			final int STAR = 17;
			final int DVD = 18;
			final int EQR = 19;
			final int GTR = 20;
			final int LTR = 21;
			final int LER = 22;
			final int GER = 23;
			final int NER = 24;
			final int LPAR = 25;
			final int RPAR = 26;
			final int KWDECLARE = 28;
			final int KWINTEGER = 29;
			final int KWEDECLARE = 30;
			
			//Asks person for location and name of the .txt file
			//An example of that to put in is: C:\Users\(name of user)\Desktop\(name of file).txt
			String txtfile;
			System.out.println("Enter the location of the .txt File:");
			Scanner filename = new Scanner(System.in);
			txtfile=filename.nextLine();
			//reads the lines of the txt file
			FileReader file = new FileReader(txtfile);
			BufferedReader reader = new BufferedReader(file);
			
			String text = "";
			String line = reader.readLine();
			System.out.println(text);
			while(line !=null)
			{
				//Break into classes and don't worry about parameters work different functions
				text += line;
				line = reader.readLine();
				char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
						'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
						';',',',':','=','+','-','*','/','>','<','#','(',')','0','1','2','3','4','5','6','7','8','9',' '};
				int i = 0;
				while (i<=text.length())
				{
					if(text.charAt(i)>='0'&&text.charAt(i)<='9')//65 and 74
					{
						log(Integer.toString(CONST));
						System.out.println(CONST);
						char num =text.charAt(i);
						System.out.println(num);
						log(Character.toString(num));
						i++;
					   
					}
					if(text.charAt(i)==';')
					{
						log(Integer.toString(SEMI));
						System.out.println(SEMI);
						
						i++;
					}
					if(text.charAt(i)==',')
					{
						System.out.println(COMMA);
						log(Integer.toString(COMMA));
						i++;
		
					}
					if(text.charAt(i)=='+')
					{
						System.out.println(PLUS);
						log(Integer.toString(PLUS));
						i++;
					}
					if(text.charAt(i)=='-')
					{
						System.out.println(MINUS);
						log(Integer.toString(MINUS));
						i++;
					}
					if(text.charAt(i)=='*')
					{
						System.out.println(STAR);
						log(Integer.toString(STAR));
						i++;
					}
					if(text.charAt(i)=='/')
					{
						System.out.println(DVD);
						log(Integer.toString(DVD));
						i++;
					}
					if(text.charAt(i)=='=')
					{
						System.out.println(EQR);
						log(Integer.toString(EQR));
						i++;
					}
					if(text.charAt(i)=='>')
					{
						if(text.charAt(i+1)=='=')
						{
							log(Integer.toString(GER));
							System.out.println(GER);
							i++;
						}
						else 
							System.out.println(GTR);
							log(Integer.toString(GTR));
						i++;
					}
					if(text.charAt(i)=='<')
					{
						if(text.charAt(i+1)=='=')
						{
							System.out.println(LER);
							log(Integer.toString(LER));
							i++;
						}
						else 
							System.out.println(LTR);
						    log(Integer.toString(LTR));	
						i++;
					}
					if(text.charAt(i)=='#')
					{
						if(text.charAt(i+1)=='#')
						{
							log(Integer.toString(NER));
							log(Integer.toString(NER));
							System.out.println(NER);
							System.out.println(NER);
							break;
						}
						log(Integer.toString(NER));
						System.out.println(NER);
					}
					if(text.charAt(i)=='(')
					{
						log(Integer.toString(LPAR));
						System.out.println(LPAR);
						i++;
					}
					if(text.charAt(i)==')')
					{
						log(Integer.toString(RPAR));
						System.out.println(RPAR);
						i++;
					}
					if(text.charAt(i)==':')
					{
						if(text.charAt(i+1)=='=')
						{
							log(Integer.toString(ASGN));
							System.out.println(ASGN);
							i=i+2;
						}
						
					}
					if(text.charAt(i)=='d')
					{
						if(text.charAt(i+1)=='e')
						{
							if(text.charAt(i+2)=='c')
							{
								if(text.charAt(i+3)=='l')
								{
									if(text.charAt(i+4)=='a')
									{
										if(text.charAt(i+5)=='r')
										{
											if(text.charAt(i+6)=='e')
											{
												if(text.charAt(i+7)==' ')
												{
												log(Integer.toString(KWDECLARE));
												System.out.println(KWDECLARE);
												i=i+7;
												}
												else if(text.charAt(i)>=ch[0])//0 and 51
												{
													log(Integer.toString(IDR)); 
													System.out.println(IDR);
													if(text.charAt(i)<=ch[51])//0 and 51
													{
														System.out.println(IDR);
														log(Integer.toString(IDR));
													}
													i++;
												}
											}
											else if(text.charAt(i)>=ch[0])//0 and 51
											{
												log(Integer.toString(IDR)); 
												System.out.println(IDR);
												if(text.charAt(i)<=ch[51])//0 and 51
												{
													System.out.println(IDR);
													log(Integer.toString(IDR));
												}
												i++;
											}
											
										}
										else if(text.charAt(i)>=ch[0])//0 and 51
										{
											log(Integer.toString(IDR)); 
											System.out.println(IDR);
											if(text.charAt(i)<=ch[51])//0 and 51
											{
												System.out.println(IDR);
												log(Integer.toString(IDR));
											}
											i++;
										}
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									i++;
								}
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							i++;
						}
					}
					if(text.charAt(i)=='e')
					{
						if(text.charAt(i+1)=='d')
						{
							if(text.charAt(i+2)=='e')
							{
								if(text.charAt(i+3)=='c')
								{
									if(text.charAt(i+4)=='l')
									{
										if(text.charAt(i+5)=='a')
										{
											if(text.charAt(i+6)=='r')
											{
												if(text.charAt(i+7)=='e')
												{
													if(text.charAt(i+8)==' ')
													{
													log(Integer.toString(KWEDECLARE));
													System.out.println(KWEDECLARE);
													i=i+8;
													}
													else if(text.charAt(i)>=ch[0])//0 and 51
													{
														log(Integer.toString(IDR)); 
														System.out.println(IDR);
														if(text.charAt(i)<=ch[51])//0 and 51
														{
															System.out.println(IDR);
															log(Integer.toString(IDR));
														}
														
														i++;
													}
												}
												else if(text.charAt(i)>=ch[0])//0 and 51
												{
													log(Integer.toString(IDR)); 
													System.out.println(IDR);
													if(text.charAt(i)<=ch[51])//0 and 51
													{
														System.out.println(IDR);
														log(Integer.toString(IDR));
													}
													
													i++;
												}
											}
											else if(text.charAt(i)>=ch[0])//0 and 51
											{
												log(Integer.toString(IDR)); 
												System.out.println(IDR);
												if(text.charAt(i)<=ch[51])//0 and 51
												{
													System.out.println(IDR);
													log(Integer.toString(IDR));
												}
												
												i++;
											}
											
										}
										else if(text.charAt(i)>=ch[0])//0 and 51
										{
											log(Integer.toString(IDR)); 
											System.out.println(IDR);
											if(text.charAt(i)<=ch[51])//0 and 51
											{
												System.out.println(IDR);
												log(Integer.toString(IDR));
											}
											
											i++;
										}
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									
									i++;
								}
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='i')
					{
						if(text.charAt(i+1)=='n')
						{
							if(text.charAt(i+2)=='t')
							{
								if(text.charAt(i+3)=='e')
								{
									if(text.charAt(i+4)=='g')
									{
										if(text.charAt(i+5)=='e')
										{
											if(text.charAt(i+6)=='r')
											{
												if(text.charAt(i+7)==' ')
												{
													log(Integer.toString(KWINTEGER));
													System.out.println(KWINTEGER);
													i=i+7;
												}
												else if(text.charAt(i)>=ch[0])//0 and 51
												{
													log(Integer.toString(IDR)); 
													System.out.println(IDR);
													if(text.charAt(i)<=ch[51])//0 and 51
													{
														System.out.println(IDR);
														log(Integer.toString(IDR));
													}
													
													i++;
												}
											}
											else if(text.charAt(i)>=ch[0])//0 and 51
											{
												log(Integer.toString(IDR)); 
												System.out.println(IDR);
												if(text.charAt(i)<=ch[51])//0 and 51
												{
													System.out.println(IDR);
													log(Integer.toString(IDR));
												}
												
												i++;
											}
											
										}
										else if(text.charAt(i)>=ch[0])//0 and 51
										{
											log(Integer.toString(IDR)); 
											System.out.println(IDR);
											if(text.charAt(i)<=ch[51])//0 and 51
											{
												System.out.println(IDR);
												log(Integer.toString(IDR));
											}
											
											i++;
										}
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									
									i++;
								}
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='r')
					{
						if(text.charAt(i+1)=='e')
						{

							if(text.charAt(i+2)=='a')
							{
								if(text.charAt(i+3)=='d')
								{
									if(text.charAt(i+4)==' ')
									{
									log(Integer.toString(KWRD));
									System.out.println(KWRD);
									i=i+4;
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									
									i++;
								}
								
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
							
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='w')
					{
						if(text.charAt(i+1)=='r')
						{
							if(text.charAt(i+2)=='i')
							{
								if(text.charAt(i+3)=='t')
								{
									if(text.charAt(i+4)=='e')
									{
										if(text.charAt(i+5)==' ')
										{
										log(Integer.toString(KWWR));
										System.out.println(KWWR);
										i=i+5;
										}
										else if(text.charAt(i)>=ch[0])//0 and 51
										{
											log(Integer.toString(IDR)); 
											System.out.println(IDR);
											if(text.charAt(i)<=ch[51])//0 and 51
											{
												System.out.println(IDR);
												log(Integer.toString(IDR));
											}
											
											i++;
										}
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									
									i++;
								}
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='i')
					{
						if(text.charAt(i+1)=='f')
						{
							if(text.charAt(i+2)==' ')
							{
							log(Integer.toString(KWIF));
							System.out.println(KWIF);
							i=i+2;
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='t')
					{
						if(text.charAt(i+1)=='h')
						{
							if(text.charAt(i+2)=='e')
							{
								if(text.charAt(i+3)=='n')
								{
									if(text.charAt(i+4)==' ')
									{
									log(Integer.toString(KWTH));
									System.out.println(KWTH);
									i=i+4;
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									
									i++;
								}
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='e')
					{
						if(text.charAt(i+1)=='l')
						{
							if(text.charAt(i+2)=='s')
							{
								if(text.charAt(i+3)=='e')
								{
									if(text.charAt(i+4)==' ')
									{
									log(Integer.toString(KWEL));
									System.out.println(KWEL);
									i=i+4;
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									
									i++;
								}
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='f')
					{
						if(text.charAt(i+1)=='i')
						{
							if(text.charAt(i+2)==' ')
							{
							log(Integer.toString(KWFI));
							System.out.println(KWFI);
							i=i+2;
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='t')
					{
						if(text.charAt(i+1)=='o')
						{
							if(text.charAt(i+2)==' ')
							{	
							log(Integer.toString(KWTO));
							System.out.println(KWTO);
							i=i+2;
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='d')
					{
						if(text.charAt(i+1)=='o')
						{
							if(text.charAt(i+2)==' ')
							{
							log(Integer.toString(KWDO));
							System.out.println(KWDO);
							i=i+2;
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)=='e')
					{
						if(text.charAt(i+1)=='n')
						{
							if(text.charAt(i+2)=='d')
							{
								if(text.charAt(i+3)=='o')
								{
									if(text.charAt(i+4)=='o')
									{
										if(text.charAt(i+5)=='p')
										{
											if(text.charAt(i+6)==' ')
											{
											log(Integer.toString(KWENDL));
											System.out.println(KWENDL);
											i=i+6;
											}
											else if(text.charAt(i)>=ch[0])//0 and 51
											{
												log(Integer.toString(IDR)); 
												System.out.println(IDR);
												if(text.charAt(i)<=ch[51])//0 and 51
												{
													System.out.println(IDR);
													log(Integer.toString(IDR));
												}
												
												i++;
											}
										}
										else if(text.charAt(i)>=ch[0])//0 and 51
										{
											log(Integer.toString(IDR)); 
											System.out.println(IDR);
											if(text.charAt(i)<=ch[51])//0 and 51
											{
												System.out.println(IDR);
												log(Integer.toString(IDR));
											}
											
											i++;
										}
									}
									else if(text.charAt(i)>=ch[0])//0 and 51
									{
										log(Integer.toString(IDR)); 
										System.out.println(IDR);
										if(text.charAt(i)<=ch[51])//0 and 51
										{
											System.out.println(IDR);
											log(Integer.toString(IDR));
										}
										
										i++;
									}
								}
								else if(text.charAt(i)>=ch[0])//0 and 51
								{
									log(Integer.toString(IDR)); 
									System.out.println(IDR);
									if(text.charAt(i)<=ch[51])//0 and 51
									{
										System.out.println(IDR);
										log(Integer.toString(IDR));
									}
									
									i++;
								}
							}
							else if(text.charAt(i)>=ch[0])//0 and 51
							{
								log(Integer.toString(IDR)); 
								System.out.println(IDR);
								if(text.charAt(i)<=ch[51])//0 and 51
								{
									System.out.println(IDR);
									log(Integer.toString(IDR));
								}
								
								i++;
							}
						}
						else if(text.charAt(i)>=ch[0])//0 and 51
						{
							log(Integer.toString(IDR)); 
							System.out.println(IDR);
							if(text.charAt(i)<=ch[51])//0 and 51
							{
								System.out.println(IDR);
								log(Integer.toString(IDR));
							}
							
							i++;
						}
					}
					if(text.charAt(i)==' ')
					{
						i++;
					}
					if(text.charAt(i)>=ch[0])//0 and 51
					{
						log(Integer.toString(IDR)); 
						System.out.println(IDR);
						if(text.charAt(i)<=ch[51])//0 and 51
						{
							System.out.println(IDR);
							log(Integer.toString(IDR));
						}
						
						i++;
					}
				}
				
			//System.out.println(text.charAt(i));
			}
		System.out.println(text);
		table();
		}	
		
		public static void log(String message) throws IOException 
		{ 
		      PrintWriter out = new PrintWriter(new FileWriter("Second.txt", true), true);
		      out.write(message+" ");
		      out.close();
		    }
		public static void table()
		{
			final Object[][] table = new String[27][];
			table[0] = new String[] { "Code", "Token"};
			table[1] = new String[] { "1", "Identifier"};
			table[2] = new String[] { "2", "Constant"};
			table[3] = new String[] { "3", "Read"};
			table[4] = new String[] { "4", "write"};
			table[5] = new String[] { "5", "if"};
			table[6] = new String[] { "6", "then"};
			table[7] = new String[] { "7", "else"};
			table[8] = new String[] { "8", "fi"};
			table[9] = new String[] { "9", "to" };
			table[10] = new String[] { "10", "do"};
			table[11] = new String[] { "11", "endoop" };
			table[12] = new String[] { "12", ";"};
			table[13] = new String[] { "13", ","};
			table[14] = new String[] { "14", ":=" };
			table[15] = new String[] { "15", "+" };
			table[16] = new String[] { "16", "-" };
			table[17] = new String[] { "17", "*" };
			table[18] = new String[] { "18", "/" };
			table[19] = new String[] { "19", "="};
			table[20] = new String[] { "20", ">" };
			table[21] = new String[] { "21", "<" };
			table[22] = new String[] { "22", "<="};
			table[23] = new String[] { "23", ">="};
			table[24] = new String[] { "24", "#" };
			table[25] = new String[] { "25", "(" };
			table[26] = new String[] { "26", ")" };

			for (final Object[] row : table) {
			    System.out.format("%15s%15s\n", row);
			}
		}
	}

