final int OFF = 0;   
   // Method for encoder BACKWARD mpovement
     public void backwardByEncoder(double speed, double distance){
         robot.reset();
         // while (((-bl.getCurrentPosition() < distance)) && (distance - -bl.getCurrentPosition)){
         while (((-robot.bl.getCurrentPosition() > distance) && !isStopRequested())){
         robot.fl.setPower(-speed);
         robot.fr.setPower(-speed);
         robot.bl.setPower(-speed);
         robot.br.setPower(-speed);
         // -speed was BACKWARD
        
         }
         robot.fl.setPower(OFF);
         robot.fr.setPower(OFF);
         robot.bl.setPower(OFF);
         robot.br.setPower(OFF);
     }    
     // Methods 
    public void forwardByEncoder(double speed, double distance){
        // while (((-bl.getCurrentPosition() < distance)) && (distance - -bl.getCurrentPosition)){
        robot.reset();
        while ((-robot.bl.getCurrentPosition() < distance) && !isStopRequested()){
        //  fl.setPower(FORWARD);
        //  fr.setPower(FORWARD);
        //  bl.setPower(FORWARD);
        //  br.setPower(FORWARD);
            robot.fl.setPower(speed);
            robot.fr.setPower(speed);
            robot.bl.setPower(speed);
            robot.br.setPower(speed);
        }
         robot.fl.setPower(OFF);
         robot.fr.setPower(OFF);
         robot.bl.setPower(OFF);
         robot.br.setPower(OFF);
    }  
    
    // Method for encoder RIGHT movement
     public void rightByEncoder(double speed, double distance){
        robot.reset();
        while (((robot.fr.getCurrentPosition() < distance) && !isStopRequested())){
        // Note: +speed was FORWARD, -speed was BACK
        robot.fl.setPower(speed);
        robot.fr.setPower(-speed);
        robot.bl.setPower(-speed);
        robot.br.setPower(speed);
        }
         robot.fl.setPower(OFF);
         robot.fr.setPower(OFF);
         robot.bl.setPower(OFF);
         robot.br.setPower(OFF);
     }    
    
    
    // Method for encoder LEFT mpovement
     public void leftByEncoder(double speed, double distance){
         robot.reset();
         while (((robot.fr.getCurrentPosition() > distance)) && !isStopRequested()){
            // Note: +speed was FORWARD, -speed was BACK
            robot.fl.setPower(-speed);
            robot.fr.setPower(speed);
            robot.bl.setPower(speed);
            robot.br.setPower(-speed);
        // fl.setPower(-Math.abs(speed));
        // fr.setPower(Math.abs(speed));
        // bl.setPower(Math.abs(speed));
        // br.setPower(-Math.abs(speed)); 
         }
         robot.fl.setPower(OFF);
         robot.fr.setPower(OFF);
         robot.bl.setPower(OFF);
         robot.br.setPower(OFF);
     }
