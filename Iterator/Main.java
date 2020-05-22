import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      
        Person per1 = new Person("Jakub", 20);
        Person per2 = new Person("Lukáš", 21);
        Person per3 = new Person("Filip", 30);
        Person per4 = new Person("Honza", 35);
        Person per5 = new Person("Ondøej", 12);
        Person per6 = new Person("koza", 23);
        Person per7 = new Person("Tobík", 5);

        PersonCollection perCol = new PersonCollection();

        perCol.add(per1);
        perCol.add(per2);
        perCol.add(per3);
        perCol.add(per4);
        perCol.add(per5);
        perCol.add(per6);
        perCol.add(per7);

        Iterator myIt = perCol.Iterator();

        while (myIt.hasNext()) {
            Person p = myIt.getNext();
            System.out.println("Jméno: " + p.getName());
            System.out.println("Vìk: " + p.getAge());
            System.out.println("---------------------------------");
        }
    }
}

class Person {

    private String name;
    private int age;

    Person(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

interface Iterator {

    public boolean hasNext();
    public Person getNext();
}

class PersonCollection {

    @SuppressWarnings("unchecked")
    private ArrayList<Person> persons = new ArrayList();
    

    public PersonIterator Iterator() {
        return new PersonIterator();
    }

    public void add(Person per) {
        this.persons.add(per);
    }

    private class PersonIterator implements Iterator {
        private int current = 0;

        public boolean hasNext() {
            if (current == persons.size()) {
                return false;
            } else {
                return true;
            }
        }

		public Person getNext() {
			return persons.get(current++);
        }
    }
}