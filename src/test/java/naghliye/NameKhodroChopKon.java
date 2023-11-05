package naghliye;

public class NameKhodroChopKon {
    Naghliyeh[] naghliyehha;
    public NameKhodroChopKon(Naghliyeh[] naghliyaha) {
        this.naghliyehha = naghliyaha;
    }

    public String execute() {
        String nameKhodroha = "";
        for(int i = 0;i<naghliyehha.length;i++) {
            if (i == (naghliyehha.length - 1)) {
                nameKhodroha = nameKhodroha + naghliyehha[i].getMark();
            } else {
                nameKhodroha = nameKhodroha  + naghliyehha[i].getMark() + "-";
            }
        }
        return nameKhodroha;
    }
}
