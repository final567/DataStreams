public class Pizza {
 protected String name;
 protected String dough;
 protected String sauce;
    
 public void prepare() {
  System.out.println("----------------------------------");
  System.out.println(this.name + "를 준비중입니다.");
  System.out.println(this.dough + "도우 반죽중...");
  System.out.println(this.sauce + "소스 추가중...");
  System.out.println("----------------------------------");
 }

 public void bake() {
  System.out.println(this.name + "피자를 굽습니다.");
 }

 public void cut() {
  System.out.println(this.name + "피자를 자릅니다.");
 }

 public void box() {
  System.out.println(this.name + "피자를 포장합니다.");
 }
 

}


