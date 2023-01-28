package TCS;


    import java.util.Scanner;

    class Cricketer{
        int id;
        String name;
        int no;
        String group;
        String type;

        public Cricketer(int id, String name, int no, String group, String type) {
            this.id = id;
            this.name = name;
            this.no = no;
            this.group = group;
            this.type = type;
        }
    }
    public class CricketerSample {
        public static void main(String args[]) {
            Cricketer c[] = new Cricketer[4];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                int id = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                int no = sc.nextInt();
                sc.nextLine();
                String group = sc.nextLine();
                String type = sc.nextLine();
                c[i] = new Cricketer(id, name, no, group, type);
            }
            String group = sc.nextLine();
            String type = sc.nextLine();

            Cricketer out=findmax(c,group,type);
            if(out==null){
                System.out.println("no case exixts");
            }
            else
                System.out.println(out.no);
        }

        public static Cricketer findmax(Cricketer c[], String group, String type) {
            Cricketer out = null;
            int minno = Integer.MAX_VALUE;
            for (int i = 0; i < c.length; i++) {
                if (c[i].group.equals(group) && c[i].type.equals(type)) {
                    if (c[i].no < minno) {
                        minno = c[i].no;
                    }
                }
            }
            for (int i = 0; i < c.length; i++) {
                if (c[i].group.equals(group) && c[i].type.equals(type)) {
                    if (c[i].no == minno) {
                        out = c[i];
                    }
                }
            }
            return out;

        }
    }
