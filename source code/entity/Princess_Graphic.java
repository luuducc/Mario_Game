package entity;
import screen.GamePanel;
import java.util.Random;




public class Princess_Graphic extends EntityGraphic {
    public NPC_Princess npcPrin;
    
    public Princess_Graphic(GamePanel gp) {
        super(gp);
		npcPrin = new NPC_Princess();
		direction = "down";
		
		getImage();

		solidArea.x = 8;
        solidArea.y = 16;
        solidArea.height = 48;
        solidArea.width = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        setDialogue();
	}
	public void getImage() {
        up1 = setup("/res/npc/princess_up_2",gp.tileSize, gp.tileSize);
        up2 = setup("/res/npc/princess_up_4",gp.tileSize, gp.tileSize);
        down1 = setup("/res/npc/princess_down_2",gp.tileSize, gp.tileSize);
        down2 = setup("/res/npc/princess_down_4",gp.tileSize, gp.tileSize);
        left1 = setup("/res/npc/princess_left_2",gp.tileSize, gp.tileSize);
        left2 = setup("/res/npc/princess_left_4",gp.tileSize, gp.tileSize);
        right1 = setup("/res/npc/princess_right_2",gp.tileSize, gp.tileSize);
        right2 = setup("/res/npc/princess_right_4",gp.tileSize, gp.tileSize);
    }
	public void setDialogue() {
		dialogues[0] = "Oh my hero. Thanks for rescue me!";
		// dialogues[0] = "Ouch, you've just touched me";
	}
	
	
	
	public void setAction() {
		actionLockCounter++;
		   
		   if(actionLockCounter == 120) {
			   Random random = new Random();
			   int i = random.nextInt(100)+1; //pick up a number from 1 to 100
			   if(i <= 25) {
				   direction = "up";
			   }
			   if(i > 25 && i <= 50) {
				   direction = "down";
			   }
			   if(i > 50 && i <= 75) {
				   direction = "left";
			   }
			   if(i > 75 && i <= 100) {
				   direction = "right";
			   }
			   
			   actionLockCounter = 0;
		   }
	   }
    
}
