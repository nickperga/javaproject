public class BPSale {
    
    String SMCode;
    String BPCode;
    String causality;
    String type;

    BPSale(String SMCode, String BPCode, String causality, String type){
        this.SMCode = SMCode;
        this.BPCode = BPCode;
        this.causality = causality;
        this.type = type;
    }

    BPSale(){

    }
    
    void setType(String type) {
        this.type = type;
    }
        
    void setSMCode(String SMCode) {
        this.SMCode = SMCode;
    }
    
    void setBPCode(String BP) {
        this.BPCode = BP;
    }
    
    void setCausality(String causality) {
        this.causality = causality;
    }

    String getSMCode(BPSale bpsale) {
        return this.SMCode;
    }

    String getBPCode(BPSale bpsale) {
        return this.BPCode;
    }

    String getType (BPSale bpsale) {
        return this.type;
    }

    String getCausality (BPSale bpsale) {
        return this.causality;
    }
}