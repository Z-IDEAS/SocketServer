import java.util.Vector;


public class ChatManager {
	private ChatManager(){}
	private static final ChatManager cm = new ChatManager();
	public static ChatManager getChatManager(){
		return cm;
	}

	Vector<ChatSocket> vector = new Vector<ChatSocket>();

	public void add(ChatSocket cs){
		vector.add(cs);
	}

	public void publish(ChatSocket cs,String out){
//		if(out.startsWith("MY_NAME_IS")){
//			cs.name = out.substring(10);
//			System.out.println(cs.name);
//		}
//		else{
		for(int i = 0;i<vector.size();i++){
			ChatSocket csnew = vector.get(i);
			if(!csnew.equals(cs)){
			csnew.cout(out);
			}
		}
		}
	}
