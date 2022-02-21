package Parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gramatica {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[(]+(move\s)+([1-8]+[)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("move 5");
		Pattern pattern2 = Pattern.compile("[(]+(defvar\s)+(.*\s)+([0-9]+[)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher2 = pattern2.matcher("(defvar abc 5)");
		Pattern pattern3 = Pattern.compile("[(]+(=\s)+(.*\s)+([0-9]+[)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher3 = pattern3.matcher("(= abc 6)");
		Pattern pattern4 = Pattern.compile("[(]+(turn\s)+(left|right|around)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher4 = pattern4.matcher("(turn around)");
		Pattern pattern5 = Pattern.compile("[(]+(face\s)+(north|south|east|west)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher5 = pattern5.matcher("(face west)");
		Pattern pattern6 = Pattern.compile("[(]+(put\s)+((Ballons|Chips)\s)+([0-9]|.*)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher6 = pattern6.matcher("(put Ballons 5)");
		Pattern pattern7 = Pattern.compile("[(]+(pick\s)+((Ballons|Chips)\s)+([0-9]|.*)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher7 = pattern7.matcher("(pick Chips 2)");
		Pattern pattern8 = Pattern.compile("[(]+(move-dir\s)+(([0-9]|.*)\s)+(front|right|left|back)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher8 = pattern8.matcher("(move-dir 3 left)");
		Pattern pattern9 = Pattern.compile("[(]+(run-dirs\s)+(.*)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher9 = pattern9.matcher("(run-dirs [front,right,front])");
		Pattern pattern10 = Pattern.compile("[(]+(move-face\s)+(([0-9]|.*)\s)+(north|south|west|east)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher10 = pattern10.matcher("(move-face 4 west)");
		Pattern pattern11 = Pattern.compile("[(]+(skip)+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher11 = pattern11.matcher("(skip)");
		Pattern pattern12 = Pattern.compile("[(]+(if\s)+[(]+(((facing-p\s)+(north|south|west|east))|(((can-put-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-pick-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-move-p)\s)+(north|south|west|east))|((not)\s)+((((facing-p)\s)+(north|south|east|west))|(((can-put-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-pick-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-move-p)\s)+(north|south|west|east))))+[)]\s+[(](.*)+[)]\s+[(](.*)+[)]+[)]", Pattern.CASE_INSENSITIVE);
		Matcher matcher12 = pattern12.matcher("(if (not can-put-p chips 5) (asa) (asa))");
		Pattern pattern13 = Pattern.compile("[(]+(loop\s)+[(]+(((facing-p\s)+(north|south|west|east))|(((can-put-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-pick-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-move-p)\s)+(north|south|west|east))|((not)\s)+((((facing-p)\s)+(north|south|east|west))|(((can-put-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-pick-p)\s)+((chips|balloons)\s)+([0-9]|.*))|(((can-move-p)\s)+(north|south|west|east))))+[)]\s+[(](.*)+[)]\s+[)]", Pattern.CASE_INSENSITIVE);
		Matcher matcher13 = pattern13.matcher("(loop (facing-p north) (asa) )");
		Pattern pattern14 = Pattern.compile("[(]+(repeat\s)+(([0-9]|.*)\s)+[(](.*)+[)]+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher14 = pattern14.matcher("(repeat 5 (asa))");
		Pattern pattern15 = Pattern.compile("[(]+(defun name\s)+[(](.*)+[)]\s+[(](.*)+[)]+([)])", Pattern.CASE_INSENSITIVE);
		Matcher matcher15 = pattern15.matcher("(defun name (abc) (asa))");
	    boolean matchFound = matcher15.find();
	    if(matchFound) {
	      System.out.println("La expresión es correcta");
	    } else {
	      System.out.println("La expresión no es correcta");
	    }
	  }
	}
