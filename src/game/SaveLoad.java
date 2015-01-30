//Made by Mark Keller
package game;
import java.io.*;
public class SaveLoad {
	public static void save(){
		try{
			FileWriter out;
			BufferedWriter writeFile;
			File Save = new File("Save.txt");
                        if(!Save.exists()){
                            Save.createNewFile();
                        }
			out = new FileWriter(Save);
			writeFile = new BufferedWriter(out);
				writeFile.write(""+gVariables.kCounter);
				writeFile.newLine();
				writeFile.write(""+Maps.pX);//c == 2
				writeFile.newLine();
				writeFile.write(""+Maps.pY);//c == 3
				writeFile.newLine();
				writeFile.write(""+Main.bgX);//c == 4
				writeFile.newLine();
				writeFile.write(""+Main.bgY);//c == 5
                                for(int intC=1; intC<22; intC++){
				writeFile.newLine();
				writeFile.write(""+PartyPokemon.partypkmn[1][intC]);}
                                writeFile.newLine();
				writeFile.write(""+Maps.mcode);//c == 7
			writeFile.close();
			}
		catch(IOException n){}
	}
	public static void load(){
		String mypath, fileinfo;
		mypath="Save.txt";
		File datafile = new File(mypath);
		FileReader in;
		BufferedReader readFile;
                if(datafile.exists()){
		int c = 1;
		try{
			in = new FileReader(datafile);
			readFile = new BufferedReader(in);
			while((fileinfo = readFile.readLine())!= null){
				if(c == 1){
                                    gVariables.kCounter = Integer.valueOf(fileinfo);
				}
				else if(c == 2){
					Maps.pX = Integer.valueOf(fileinfo);
				}
                                else if(c == 3){
					Maps.pY = Integer.valueOf(fileinfo);
				}
                                else if(c == 4){
					Main.bgX = Integer.valueOf(fileinfo);
				}
                                else if(c == 5){
					Main.bgY = Integer.valueOf(fileinfo);
				}
                                else if(c == 6){
					PartyPokemon.partypkmn[1][1]=Integer.valueOf(fileinfo);
				}
                                else if(c == 7){
					PartyPokemon.partypkmn[1][2]=Integer.valueOf(fileinfo);
				}
                                else if(c == 8){
					PartyPokemon.partypkmn[1][3]=Integer.valueOf(fileinfo);
				}
                                else if(c == 9){
					PartyPokemon.partypkmn[1][4]=Integer.valueOf(fileinfo);
				}
                                else if(c == 10){
					PartyPokemon.partypkmn[1][5]=Integer.valueOf(fileinfo);
				}
                                else if(c == 11){
					PartyPokemon.partypkmn[1][6]=Integer.valueOf(fileinfo);
				}
                                else if(c == 12){
					PartyPokemon.partypkmn[1][7]=Integer.valueOf(fileinfo);
				}
                                else if(c == 13){
					PartyPokemon.partypkmn[1][8]=Integer.valueOf(fileinfo);
				}
                                else if(c == 14){
					PartyPokemon.partypkmn[1][9]=Integer.valueOf(fileinfo);
				}
                                else if(c == 15){
					PartyPokemon.partypkmn[1][10]=Integer.valueOf(fileinfo);
				}
                                else if(c == 16){
					PartyPokemon.partypkmn[1][11]=Integer.valueOf(fileinfo);
				}
                                else if(c == 17){
					PartyPokemon.partypkmn[1][12]=Integer.valueOf(fileinfo);
				}
                                else if(c == 18){
					PartyPokemon.partypkmn[1][13]=Integer.valueOf(fileinfo);
				}
                                else if(c == 19){
					PartyPokemon.partypkmn[1][14]=Integer.valueOf(fileinfo);
				}
                                else if(c == 20){
					PartyPokemon.partypkmn[1][15]=Integer.valueOf(fileinfo);
				}
                                else if(c == 21){
					PartyPokemon.partypkmn[1][16]=Integer.valueOf(fileinfo);
				}
                                else if(c == 22){
					PartyPokemon.partypkmn[1][17]=Integer.valueOf(fileinfo);
				}
                                else if(c == 23){
					PartyPokemon.partypkmn[1][18]=Integer.valueOf(fileinfo);
				}
                                else if(c == 24){
					PartyPokemon.partypkmn[1][19]=Integer.valueOf(fileinfo);
				}
                                else if(c == 25){
					PartyPokemon.partypkmn[1][20]=Integer.valueOf(fileinfo);
				}
                                else if(c == 26){
					PartyPokemon.partypkmn[1][21]=Integer.valueOf(fileinfo);
				}
                                else if(c == 27){
                                    if(Integer.valueOf(fileinfo)==1){
                                        Maps.room();
                                    }
                                    else if(Integer.valueOf(fileinfo)==2){
                                        Maps.kitchen();
                                    }
                                    else if(Integer.valueOf(fileinfo)==3){
                                        Maps.world();
                                    }
				}
				c++;
			}
			readFile.close();
		}
		catch(IOException n ) {
			System.out.println("Error Opening File");

		}
                Main.scene="move";
                }
	}
        
        public static String makePokeLine(int in){
            String back="";
            if(PartyPokemon.partypkmn[in][1]>=0 && PartyPokemon.partypkmn[in][1]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][1]);}//Species
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][1]);}
            if(PartyPokemon.partypkmn[in][2]>=0 && PartyPokemon.partypkmn[in][2]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][2]);}//Level
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][2]);}
            if(PartyPokemon.partypkmn[in][3]>=0 && PartyPokemon.partypkmn[in][3]<10){back+="00"+String.valueOf(PartyPokemon.partypkmn[in][3]);}//Max Hp
            else if(PartyPokemon.partypkmn[in][3]>9 && PartyPokemon.partypkmn[in][3]<100){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][3]);}
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][3]);}
            if(PartyPokemon.partypkmn[in][4]>=0 && PartyPokemon.partypkmn[in][4]<10){back+="00"+String.valueOf(PartyPokemon.partypkmn[in][4]);}//Current Hp
            else if(PartyPokemon.partypkmn[in][4]>9 && PartyPokemon.partypkmn[in][4]<100){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][4]);}
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][4]);}
            if(PartyPokemon.partypkmn[in][5]>=0 && PartyPokemon.partypkmn[in][5]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][5]);}//Attack
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][5]);}
            if(PartyPokemon.partypkmn[in][6]>=0 && PartyPokemon.partypkmn[in][6]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][6]);}//Defense
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][6]);}
            if(PartyPokemon.partypkmn[in][7]>=0 && PartyPokemon.partypkmn[in][7]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][7]);}//Sp Attack
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][7]);}
            if(PartyPokemon.partypkmn[in][8]>=0 && PartyPokemon.partypkmn[in][8]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][8]);}//Sp Defense
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][8]);}
            for(int C=10-String.valueOf(PartyPokemon.partypkmn[in][9]).length(); C>0;C--){
                back+="0";
            }
            back+=String.valueOf(PartyPokemon.partypkmn[in][9]);
            /*if(PartyPokemon.partypkmn[in][9]>=0 && PartyPokemon.partypkmn[in][9]<10){back+="000000000"+String.valueOf(PartyPokemon.partypkmn[in][9]);}//Experience
            else if(PartyPokemon.partypkmn[in][9]>9 && PartyPokemon.partypkmn[in][9]<100){back+="00000000"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else if(PartyPokemon.partypkmn[in][9]>99 && PartyPokemon.partypkmn[in][9]<1000){back+="0000000"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else if(PartyPokemon.partypkmn[in][9]>999 && PartyPokemon.partypkmn[in][9]<10000){back+="000000"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else if(PartyPokemon.partypkmn[in][9]>9999 && PartyPokemon.partypkmn[in][9]<100000){back+="00000"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else if(PartyPokemon.partypkmn[in][9]>99999 && PartyPokemon.partypkmn[in][9]<1000000){back+="0000"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else if(PartyPokemon.partypkmn[in][9]>999999 && PartyPokemon.partypkmn[in][9]<10000000){back+="000"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else if(PartyPokemon.partypkmn[in][9]>9999999 && PartyPokemon.partypkmn[in][9]<100000000){back+="00"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else if(PartyPokemon.partypkmn[in][9]>99999999 && PartyPokemon.partypkmn[in][9]<1000000000){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][9]);}
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][9]);}*/
            back+=PartyPokemon.partypkmn[in][10]; //Status
            if(PartyPokemon.partypkmn[in][11]>=0 && PartyPokemon.partypkmn[in][11]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][11]);}//Move 1
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][11]);}
            if(PartyPokemon.partypkmn[in][12]>=0 && PartyPokemon.partypkmn[in][12]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][12]);}//Move 2
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][12]);}
            if(PartyPokemon.partypkmn[in][13]>=0 && PartyPokemon.partypkmn[in][13]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][13]);}//Move 3
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][13]);}
            if(PartyPokemon.partypkmn[in][14]>=0 && PartyPokemon.partypkmn[in][14]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][14]);}//Move 4
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][14]);}
            back+=PartyPokemon.partypkmn[in][15]; //Exists
            if(PartyPokemon.partypkmn[in][16]>=0 && PartyPokemon.partypkmn[in][16]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][16]);}//Speed
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][16]);}
            if(PartyPokemon.partypkmn[in][17]>=0 && PartyPokemon.partypkmn[in][17]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][17]);}//Ability
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][17]);}
            if(PartyPokemon.partypkmn[in][18]>=0 && PartyPokemon.partypkmn[in][18]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][18]);}//Type 1
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][18]);}
            if(PartyPokemon.partypkmn[in][19]>=0 && PartyPokemon.partypkmn[in][19]<10){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][19]);}//Type 2
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][19]);}
            back+=PartyPokemon.partypkmn[in][20]; //Wild
            if(PartyPokemon.partypkmn[in][21]>=0 && PartyPokemon.partypkmn[in][21]<10){back+="000000000"+String.valueOf(PartyPokemon.partypkmn[in][21]);}//Experience
            else if(PartyPokemon.partypkmn[in][21]>9 && PartyPokemon.partypkmn[in][21]<100){back+="00000000"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else if(PartyPokemon.partypkmn[in][21]>99 && PartyPokemon.partypkmn[in][21]<1000){back+="0000000"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else if(PartyPokemon.partypkmn[in][21]>999 && PartyPokemon.partypkmn[in][21]<10000){back+="000000"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else if(PartyPokemon.partypkmn[in][21]>9999 && PartyPokemon.partypkmn[in][21]<100000){back+="00000"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else if(PartyPokemon.partypkmn[in][21]>99999 && PartyPokemon.partypkmn[in][21]<1000000){back+="0000"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else if(PartyPokemon.partypkmn[in][21]>999999 && PartyPokemon.partypkmn[in][21]<10000000){back+="000"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else if(PartyPokemon.partypkmn[in][21]>9999999 && PartyPokemon.partypkmn[in][21]<100000000){back+="00"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else if(PartyPokemon.partypkmn[in][21]>99999999 && PartyPokemon.partypkmn[in][21]<1000000000){back+="0"+String.valueOf(PartyPokemon.partypkmn[in][21]);}
            else{back+=String.valueOf(PartyPokemon.partypkmn[in][21]);}
            return back;
        }
}
