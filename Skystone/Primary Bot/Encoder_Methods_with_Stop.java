// Methods 
    public void forwardByEncoder(double speed, double distance){
        // while (((-bl.getCurrentPosition() < distance)) && (distance - -bl.getCurrentPosition)){
        reset();
        while ((-bl.getCurrentPosition() < distance) && !isStopRequested()){
        //  fl.setPower(FORWARD);
        //  fr.setPower(FORWARD);
        //  bl.setPower(FORWARD);
        //  br.setPower(FORWARD);
            fl.setPower(speed);
            fr.setPower(speed);
            bl.setPower(speed);
            br.setPower(speed);
        }
        fl.setPower(OFF);
        fr.setPower(OFF);
        bl.setPower(OFF);
        br.setPower(OFF);
    }  
    
    // Method for encoder BACKWARD mpovement
     public void backwardByEncoder(double speed, double distance){
         reset();
         // while (((-bl.getCurrentPosition() < distance)) && (distance - -bl.getCurrentPosition) && !isStopRequested()){
         while (((-bl.getCurrentPosition() > distance))){
         fl.setPower(-speed);
         fr.setPower(-speed);
         bl.setPower(-speed);
         br.setPower(-speed);
         // -speed was BACKWARD
        
         }
         fl.setPower(OFF);
         fr.setPower(OFF);
         bl.setPower(OFF);
         br.setPower(OFF);
     }    
    
    
    // Method for encoder RIGHT movement
     public void rightByEncoder(double speed, double distance){
        reset();
        while (((fr.getCurrentPosition() < distance)) && !isStopRequested()){
        // Note: +speed was FORWARD, -speed was BACK
        fl.setPower(speed);
        fr.setPower(-speed);
        bl.setPower(-speed);
        br.setPower(speed);
        }
         fl.setPower(OFF);
         fr.setPower(OFF);
         bl.setPower(OFF);
         br.setPower(OFF);
     }    
    
    
    // Method for encoder LEFT mpovement
     public void leftByEncoder(double speed, double distance){
         reset();
         while (((fr.getCurrentPosition() > distance)) && !isStopRequested()){
            // Note: +speed was FORWARD, -speed was BACK
            fl.setPower(-speed);
            fr.setPower(speed);
            bl.setPower(speed);
            br.setPower(-speed);
        // fl.setPower(-Math.abs(speed));
        // fr.setPower(Math.abs(speed));
        // bl.setPower(Math.abs(speed));
        // br.setPower(-Math.abs(speed)); 
         }
         fl.setPower(OFF);
         fr.setPower(OFF);
         bl.setPower(OFF);
         br.setPower(OFF);
     }
