public class Main {
    public static void main(String[] args) {
        int x = 5;
        x = x;

        Mouse mickey = new Mouse();
        mickey.setAge(97);
        Mouse minnie = new Mouse();
        minnie.setAge(95);

        Mouse[] disneyCharacters = new Mouse[2];
        disneyCharacters[0] = new Mouse();

        System.out.println(disneyCharacters[1].getAge());

        Mouse[] mice = {
                new Mouse(),
                new Mouse(),
                new Mouse()
        };

        if (mickey.isOlder(minnie)) {
            System.out.println("Mickey is older than minnie");
        }
        if (minnie.isOlder(mickey)) {
            System.out.println("Minnie is older than Mickey");
        }
    }
}

class Mouse {
    private int age;
    private boolean copyrightExpired;

    public Mouse() {
        this(0); // this is equivalent Mouse(0)
        setAge(0);
        // instead of just saying
        // this.age = 0;
    }

    public Mouse(int age) {
        setAge(age);
    }

    public Mouse(int age, boolean copyrightExpired) {
        this.age = age;
        this.copyrightExpired = copyrightExpired;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isOlder(Mouse otherMouse) {
        if (this.age > otherMouse.age) {
            return true;
        } else {
            return false;
        }
    }
}
