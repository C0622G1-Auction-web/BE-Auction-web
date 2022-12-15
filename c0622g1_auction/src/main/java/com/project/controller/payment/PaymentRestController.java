package com.project.controller.payment;


import com.project.model.payment.Payment;
import com.project.service.payment.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
<<<<<<< HEAD
@RequestMapping("api/v1/payments")
=======
@RequestMapping("/api/v1/{user_id}/payment")
>>>>>>> 71b775208e76c461b2c64609126bfb79bc05e666
public class PaymentRestController {
    @Autowired
    IPaymentService paymentService;

    /**Created by UyenNC
     * Date created 13/12/2022
     * Function: Get unpaid payment list of user
     * @param userId
     * @return HttpStatus.NOT_FOUND
     * return HttpStatus.OK + List<Payment>
     */
    @GetMapping("list")
    public ResponseEntity<List<Payment>> getPaymentList(@PathVariable(value = "user_id") String userId) {
        List<Payment> paymentList = paymentService.findValidPaymentByUserId(userId);


        if (paymentList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(paymentList, HttpStatus.OK);
    }

    /**
     * Created by: ChauPTM
     * Date created: 13/12/2022
     * Function: to find payment by id
     * @param id
     * @return HttpStatus.NO_CONTENT, HttpStatus.OK
     */
    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPayment(@PathVariable Integer id) {
        Payment payment = paymentService.findPaymentById(id);
        if (payment == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }
}
