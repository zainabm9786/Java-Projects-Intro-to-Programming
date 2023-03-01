public class Periodical extends Item{
    private int issueNum;

    Periodical(){

    }

    @Override
    public String getListing() {
        return "Periodical Title - "+getTitle() +"\nIssue # - " +issueNum;
    }

    Periodical(int in, String t){
        issueNum=in;
        setTitle(t);
    }
    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public int getIssueNum() {
        return issueNum;
    }

}
