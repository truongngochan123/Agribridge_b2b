package com.agribridge.backend.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminDisputeStatusUpdateRequestDto {

    private Long assignedToUserId;
    private String status;
    private String resolution;
    private String decisionType;
    private BigDecimal refundAmount;
    private BigDecimal compensationAmount;
    private Boolean releaseRemainingToSupplier;
}
