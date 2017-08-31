package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e","f"};
		
//		for (int i = 0; i <= 5 ; i++ ) {
//			System.out.println(alphabet[i]);
//		}
		
//		for (int n = 0 ; n < alphabet.length ; n++) {
//			System.out.println(alphabet[n]);
//		}
		
		//using the for each method
		for (String letter : alphabet) {
			System.out.println(letter);
		}
		
		String[][] users = { 
				{"John","Williams","jw@testemail.com"},
				{"Sarah","Jackson","sj@testemail.com"},
				{"Rachel","Wallace","rw@testemail.com"}
				};
		
		//get the size o array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("number of users: " + numOfUsers);
		System.out.println("number of fields: " + numOfFields);
		
		//traverse the double array
		for (int i = 0 ; i < numOfUsers ; i ++) {
			for (int j = 0 ; j < numOfFields ; j++) {
				System.out.println(users[i][j]);
			}
		}
		
		//traverse the double array
//		for (int i = 0 ; i < numOfUsers ; i++) {
//			String firstName = users[i][0];
//			String lastName = users[i][1];
//			String email = users[i][2];
//			String phone = users[i][3];
//		}
//		for (String[] user : users) {
//			System.out.print("{");
//			for (String field : user) {
//				System.out.print(field + " ");
//			}
//			System.out.print("}");
//		}
	}
}
