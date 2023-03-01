public abstract class Item {
    private String title;

   Item(){
       this.title="";
   }
   Item(String t){
       this.title=t;
   }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public abstract String getListing();

    @Override
    public String toString() {
        return "Title:'" + title ;
    }
}
