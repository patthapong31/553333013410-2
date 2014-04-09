package football;

public class Dante {
	public String name;
	public String position;
	public String[] friend;
	

		public Dante(){
			name = "Dante";
			position = "CB";
			friend = new String[]{"1.Philipp Lahm","2.Marco Reus","3.Diego Da Silva Costa","4.Mario Mandzukic"};
			System.out.println("Dante");
		}
		
		public Dante(int a){
			System.out.println("Dante 1");
		}
		
		public String getname(){
			return name;	
		}
		
		public String getposition(){
			return position;
		}
		
		public String[] getfriend(){
			return friend;
		}

}
