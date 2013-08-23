
/**
 * Write a description of class ReferenceTypes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReferenceTypes
{
    public void callPassByValue(){
        MemberDTO member = new MemberDTO("sss");
        passByValue(member);
        System.out.println("member.name = "+member.name);
             
    }
    
    public void passByValue(MemberDTO member){
        member = new MemberDTO("ddd");
        //member.name="SungChoon";
        System.out.println("member.name = "+member.name);
             
    }
    
    
}
