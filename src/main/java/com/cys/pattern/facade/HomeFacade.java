package com.cys.pattern.facade;

import com.cys.pattern.facade.devide.Computer;
import com.cys.pattern.facade.devide.Light;
import com.cys.pattern.facade.devide.Player;
import com.cys.pattern.facade.devide.Projector;

public class HomeFacade {
    private Computer computer;
    private Light light;
    private Player player;
    private Projector projector;

    public HomeFacade(Computer computer, Light light, Player player, Projector projector) {
        this.computer = computer;
        this.light = light;
        this.player = player;
        this.projector = projector;
    }
    // 一键观影
    public void watchMovie(){
        computer.on();
        light.down();
        projector.on();
        projector.open();
        player.on();
        player.make3DListener();
    }
    // 一键关闭
    public void stopMovie(){
        computer.off();
        light.up();
        player.off();
        projector.close();
        projector.off();
    }
}
