package Components;

import Enums.Operation;

public class Instruction {
    private boolean isFPop;
    private boolean isLoad;
    private int latency;
    private Operation operation;
    private String sourceOperand;
    private String destinationOperand;
    private String targetOperand;
    private int effectiveAddress;
    private String label; //law el instruction odamha label 3ashan nerga3 lel label da law 3ayz a3ml branch

    private int issueCycle;
    private int executionStartCycle;
    private int executionEndCycle;
    private int publishCycle; //these will be initially set to -ve values until updated

    //new constructor with the new variables
    public Instruction(boolean isFPop, boolean isLoad, int latency, Operation operation, String sourceOperand, String destinationOperand, String targetOperand, int effectiveAddress, String label, int issueCycle, int executionStartCycle, int executionEndCycle, int publishCycle) {
        this.isFPop = isFPop;
        this.isLoad = isLoad;
        this.latency = latency;
        this.operation = operation;
        this.sourceOperand = sourceOperand;
        this.destinationOperand = destinationOperand;
        this.targetOperand = targetOperand;
        this.effectiveAddress = effectiveAddress;
        this.label = label;
        this.issueCycle = issueCycle;
        this.executionStartCycle = executionStartCycle;
        this.executionEndCycle = executionEndCycle;
        this.publishCycle = publishCycle;
    }

    public boolean isFPop() {
        return isFPop;
    }

    public boolean isLoad() {
        return isLoad;
    }

    public int getLatency() {
        return latency;
    }

    public Operation getOperation() {
        return operation;
    }

    public String getSourceOperand() {
        return sourceOperand;
    }

    public String getDestinationOperand() {
        return destinationOperand;
    }

    public String getTargetOperand() {
        return targetOperand;
    }

    public int getEffectiveAddress() {
        return effectiveAddress;
    }

    public String getLabel() {
        return label;
    }

    public int getIssueCycle() {
        return issueCycle;
    }

    public void setIssueCycle(int issueCycle) {
        this.issueCycle = issueCycle;
    }

    public int getExecutionStartCycle() {
        return executionStartCycle;
    }

    public void setExecutionStartCycle(int executionStartCycle) {
        this.executionStartCycle = executionStartCycle;
    }

    public int getExecutionEndCycle() {
        return executionEndCycle;
    }

    public void setExecutionEndCycle(int executionEndCycle) {
        this.executionEndCycle = executionEndCycle;
    }

    public int getPublishCycle() {
        return publishCycle;
    }

    public void setPublishCycle(int publishCycle) {
        this.publishCycle = publishCycle;
    }

    public String toString() {
        return "Instruction{" +
                "isFPop=" + isFPop +
                ", isLoad=" + isLoad +
                ", latency=" + latency +
                ", operation=" + operation +
                ", sourceOperand='" + sourceOperand + '\'' +
                ", destinationOperand='" + destinationOperand + '\'' +
                ", targetOperand='" + targetOperand + '\'' +
                ", effectiveAddress=" + effectiveAddress +
                ", label='" + label + '\'' +
                ", issueCycle=" + issueCycle +
                ", executionStartCycle=" + executionStartCycle +
                ", executionEndCycle=" + executionEndCycle +
                ", publishCycle=" + publishCycle +
                '}';
    }

}
