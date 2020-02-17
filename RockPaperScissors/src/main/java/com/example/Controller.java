package com.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private final AtomicLong counter = new AtomicLong();
	private final AtomicLong counter2 = new AtomicLong();
	
	@GetMapping("/pvp")
	public PVP pvp(@RequestParam("player1") String player1, @RequestParam("player2") String player2){

		PVP.Game(counter.incrementAndGet(), player1, player2);
		

		   return new PVP(player1, player2);
		}
	
	@GetMapping("/pvp/restart")
	public PVP restarting1(){

		PVP.resetStats1();

		   return new PVP("", "");
		}
	@PostMapping("/vsbot")
	public VsBOT vsbot(@RequestParam(value = "play", defaultValue = "0") String play) {
		VsBOT.Game(counter2.incrementAndGet(), play);
		return new VsBOT(play);
	}
	@PostMapping("/vsbot/restart")
	public VsBOT restarting(){

		VsBOT.resetStats();

		   return new VsBOT("");
		}
	
}
