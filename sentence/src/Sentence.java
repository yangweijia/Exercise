import java.util.ArrayList;

public class Sentence {
	String sentence;
	
	public Sentence(String sentence) {
		this.sentence=sentence;	
	}
	
	public ArrayList<String> split(String separator,int fromIndex){
		int index=this.sentence.indexOf(separator,fromIndex);
		ArrayList<String> words=new ArrayList<String>();
		if(index==-1)
			words.add(this.sentence.substring(fromIndex));
		else if((index==0)||(index==this.sentence.length()-1))
		{
			words.addAll(this.split(separator,index+separator.length()));	
		}else
		{
			words.add(this.sentence.substring(fromIndex, index));
		    words.addAll(this.split(separator,index+separator.length()));		
		}
		return words;
	}
}
