package net.playmcm.qwertysam.messages;

import java.util.ArrayList;
import java.util.List;

import net.playmcm.qwertysam.messages.api.Message;
import net.playmcm.qwertysam.messages.api.MessageType;
import net.playmcm.qwertysam.messages.api.URL;

public class BecomingStaff extends Message
{
	@Override
	public MessageType type()
	{
		return MessageType.BECOME_STAFF;
	}

	@Override
	public List<List<String>> messages()
	{
		List<List<String>> messages = new ArrayList<List<String>>();

		List<String> var1 = new ArrayList<String>();
		List<String> var2 = new ArrayList<String>();
		List<String> var3 = new ArrayList<String>();
		List<String> var4 = new ArrayList<String>();
		List<String> var5 = new ArrayList<String>();

		var1.add("If you'd like to learn how you can become a staff member, check out this page.");

		var2.add("If you're interested in becoming a staff member, you can read about it here.");

		var3.add("If you would like to become a staff member, please read this page.");

		var4.add("If you want to know how to become a staff memeber then please check out this page.");

		var5.add("If you'd like to become a staff member, please read about it here.");

		var1.add(url());
		var2.add(url());
		var3.add(url());
		var4.add(url());
		var5.add(url());

		messages.add(var1);
		messages.add(var2);
		messages.add(var3);
		messages.add(var4);
		messages.add(var5);

		return messages;
	}

	@Override
	public String url()
	{
		return URL.HOW_TO_BECOME_MOD;
	}
}
