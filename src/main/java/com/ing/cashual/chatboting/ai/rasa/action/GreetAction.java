package com.ing.cashual.chatboting.ai.rasa.action;

import com.ing.cashual.chatboting.ai.rasa.model.RasaActionResponse;
import com.ing.cashual.chatboting.ai.rasa.model.RasaNextAction;
import com.ing.cashual.chatboting.ai.rasa.ActionProcessor;
import org.springframework.stereotype.Component;

@Component
public class GreetAction implements ActionProcessor {

	public String getActionName() {
		return "utter_greet";
	}

	@Override
	public RasaActionResponse performAction(RasaNextAction rasaNextAction) {
		return new RasaActionResponse("Hello.");
	}
}
