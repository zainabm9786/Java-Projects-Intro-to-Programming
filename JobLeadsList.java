import java.util.Objects;

public class JobLeadsList {
    private static Node head;
    private static Node tail;

    JobLeadsList() {
        head = null;
        tail = null;
    }

    public void add_to_front(String companyName, String contactName, String contactPhone, String jobTitle,
            String jobDescription) {
        // JobLead jobLead = new JobLead(companyName, contactName, contactPhone, jobDescription, jobTitle);
        Node node = new Node(new JobLead(companyName, contactName, contactPhone, jobDescription, jobTitle));
        if (head == null) {
            head = node;
            tail = node;
            node.next = null;
            node.prev = null;
            System.out.println("Addition to list was successful");
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            node.prev = null; // unnecessary
        }
    }

    public void add_to_tail(String companyName, String contactName, String contactPhone, String jobTitle,
            String jobDescription) {
      //  JobLead jobLead2 = new JobLead(companyName, contactName, contactPhone, jobDescription, jobTitle);
        Node node = new Node(new JobLead(companyName, contactName, contactPhone, jobDescription, jobTitle));
        if (head == null) {
            head = node;
            tail = node;
            node.next = null;
            node.prev = null;
            System.out.println("Addition to list was successful");
        } else {
            tail.next = node;
            node.prev = tail;
            node.next = null; // unnecessary
            tail = node;
        }
    }


    public void remove_lead(String companyName, String jobTitle) {
        Node ptr = head;
        boolean removed = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (ptr != null) {
                if (companyName.equals(ptr.lead.getCompanyName()) && jobTitle.equals(ptr.lead.getJobTitle())) {
                    if (ptr == head) {
                        head = ptr.next;
                        if (head != null) {
                            head.prev = null;
                        }
                        ptr = null;
                    } else {
                        ptr.prev.next = ptr.next;
                        ptr.next.prev = ptr.prev;
                        ptr = null;
                    }

                    System.out.println("Node removed");
                    removed = true;
                    break;
                }
                ptr = ptr.next;
            }
            if (!removed) {
                System.out.println("Node not found");
            }
        }
    }

    public void print_head_to_tail() {
        Node ptr = head;

        if (ptr == null) {
            System.out.println("List is empty");
        }

        while (ptr != null) {
            System.out.println(ptr.lead.toString());
            ptr = ptr.next;
        }
    }

    public void print_tail_to_head() {
        Node ptr = tail;

        if (ptr == null) {
            System.out.println("List is empty");
        }

        while (ptr != null) {
            System.out.println(ptr.lead.toString());
            ptr = ptr.prev;
        }
    }
}
