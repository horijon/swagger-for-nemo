package com.kk.swaggerdemo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Details about the resource activity of emr")
public class ResourceActivity {
    @Schema(description = "id of the emr")
    private Long emrId;
    @Schema(description = "resource name of the emr")
    private String resourceName;
    @Schema(description = "create operation if available")
    private Boolean createYn;
    @Schema(description = "search operation if available")
    private Boolean searchYn;
    @Schema(description = "retrieve operation if available")
    private Boolean retrieveYn;
    @Schema(description = "update operation if available")
    private Boolean updateYn;
    @Schema(description = "delete operation if available")
    private Boolean deleteYn;
    @Schema(description = "subscription operation if available")
    private Boolean subscriptionYn;
}
