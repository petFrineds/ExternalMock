package petfriends.external.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
    
    private Long reservedId;
    private String userId;
    private String userName;
    private String refundYn;
    private String cardCompany;
    private String cardNumber;
    private String cardValidMonth;
    private String cardValidYear;
    private String cardCvc;
    private Double amount;
    private Double refundAmount;
    private String payDate;
    private String refundDate;
    private Double currentPoint;
    
}
