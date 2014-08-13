package com.innovez.core.notif.email;

import java.util.Collection;

import org.springframework.util.Assert;

import com.innovez.core.notif.Notification;

/**
 * Simple implementation of {@link Notification} to be sent using email protocol.
 * 
 * @author zakyalvan
 */
@SuppressWarnings("serial")
public final class EmailNotification implements Notification {
	private final Recipient recipient;
	private final Subject subject;
	private final Content content;
	
	public EmailNotification(Recipient recipient, Subject subject, Content content) {
		Assert.notNull(recipient, "Recipient parameter should not be null");
		Assert.notNull(subject, "Subject parameter should not be null");
		Assert.notNull(content, "Content parameter should not be null");
		
		this.recipient = recipient;
		this.subject = subject;
		this.content = content;
	}

	@Override
	public Recipient getRecipient() {
		return recipient;
	}
	@Override
	public Subject getSubject() {
		return subject;
	}
	@Override
	public Content getContent() {
		return content;
	}

	@Override
	public Collection<Attachment> getAttachment() {
		return null;
	}
}
