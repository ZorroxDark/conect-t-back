package com.conectate.web.auth;

public class JwtConfig {
	
	
	public static final String LLAVE_PUBLICA = "alguna.clave.123";

	
	public static final String RSA_PRIVATE="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEogIBAAKCAQEA2uB6V/cJZaw2EIiWGdWQFq6/FCfJ8KJASISUobdj1QnWnoFd\r\n" + 
			"UlbU7k++YxhxOmQ55RI5KxGdSIgelSpzw/DkqTc1mQ0oe4MxgcRqoXZteOuQV7Kl\r\n" + 
			"Tkcm1WslBYsoMNs76Ayn0rN9GIMty4w59t2Z2su0sMPdu7O07ZrvcCteD5I/b1Zf\r\n" + 
			"lOvBGEmibmfpkFxR5fxb+yR93I0cvLaaN0fZOa6oqr8tgkvpCWnxj60mqdPgKQiT\r\n" + 
			"fHxuFBnwYEuLyuOGaGI8rqwOWufZxAzCz3Yj2Yije+gatPrSWo3VtsnHN2UHz/te\r\n" + 
			"5Id6P53AmG30+6dnofYyroM1l4V0YJFObsf/gQIDAQABAoIBAHbbsfR05Xh+BToD\r\n" + 
			"QiezTrTSnlcOqF3xbiEzRhdvpFn7Jr4amBfvqV/klAnyKwK/jKT1uW/G9/d8W8c7\r\n" + 
			"L3R3K2Us4wFDIPm5q7fBdvpJendQzKijDZutjcwVjBwvjlrBow2HWddUuxkFm2fO\r\n" + 
			"tWd2vWcQegYHxzB4DUd+fIoYMtMW4VVV3kYT9j4AHsnzC3AB8HboAVwPFppgMZ/E\r\n" + 
			"u01YGU59uugzxprAAPpcg976G3jNWZH+aWsOsMahKwOEXFx+aGyiwUV1erlQqymU\r\n" + 
			"ORLEqrFL+a7ZAl0fY5KFV+ExNI8qG3I6A2ztPSP81BsZY6tA//f+d+ebmiq6KjcF\r\n" + 
			"/npIHSUCgYEA//dQuXAUK+IaLgxsm22sU3kISgCIN0n+OeXHXq4EAEB8rY3PFRwg\r\n" + 
			"6qErQsnzzgrRHz8+VJoHiXmIqWuZhMPwTNtoLT8Zhtf7tiGEl+x2zG3tvf4id2vU\r\n" + 
			"FGfDx0OpgQh8RfqDwQ3RB0NMjjaInNBAfD7FEUmCbw1vifjL7e1PFHsCgYEA2ufn\r\n" + 
			"eBB/elLZCWAtZz8n1Gk5UyRZfSpx2qzwFop0yvbFVrDKNb5jeh0jAjevwvWY1Jzw\r\n" + 
			"CTK3yo/dRriBxq9Jrk3C6RKhYc5ThixYJAvHGfnaiP6poDhxd62n3TciRpGq4j6B\r\n" + 
			"ub3geo73QlZnm7z3eR2lA6DeYQ4M38lq6x/kUTMCgYAMiYaQrqauR5LUspMXQdXw\r\n" + 
			"+LqpNUF2w88J8vFC9+8GPCJfNdTwycHq/B3sVYv1iZ4Yk7Zv2mOIHkXNVpHcaOR6\r\n" + 
			"PzzpCnArpKSVlSqzbkebV78PUUVK6CMpJLP4LJ4+zbWYj96oNA8K9gbn6E/krmaa\r\n" + 
			"L1DjueADpHrUHTWP39HBxQKBgEdc9KvCjRxep9yTmxmekCiCCSsenYHddXJ5kGd4\r\n" + 
			"yaxlGF4zkihFIf7sQr51Uvo2wJUHeIU3II2LqvJkMgKIoHePaCw9Y5kT/0ytZiqS\r\n" + 
			"IF1Kg8DHbJsL64m9dgz67VSeJlxNTlM0IFs0Ak2BB5PQ3ciBLotpRTXUs8O80PtH\r\n" + 
			"0VHbAoGAbitkvkYUrvLNcHkk5FpkZkfi9Lu+rHR+JRcmViRh/O+IxOZAjQWZNh44\r\n" + 
			"iBHdFm54IM8AzBKRbXHTCizQqBQoUQWmkNgjz74EA9aUz5Q2IQ+IEMadmu+7CtTY\r\n" + 
			"BBTyHGt4oFK3957NXmn+UrptOu5XiEp8prQK/2jvSqt1C1HZLSc=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2uB6V/cJZaw2EIiWGdWQ\r\n" + 
			"Fq6/FCfJ8KJASISUobdj1QnWnoFdUlbU7k++YxhxOmQ55RI5KxGdSIgelSpzw/Dk\r\n" + 
			"qTc1mQ0oe4MxgcRqoXZteOuQV7KlTkcm1WslBYsoMNs76Ayn0rN9GIMty4w59t2Z\r\n" + 
			"2su0sMPdu7O07ZrvcCteD5I/b1ZflOvBGEmibmfpkFxR5fxb+yR93I0cvLaaN0fZ\r\n" + 
			"Oa6oqr8tgkvpCWnxj60mqdPgKQiTfHxuFBnwYEuLyuOGaGI8rqwOWufZxAzCz3Yj\r\n" + 
			"2Yije+gatPrSWo3VtsnHN2UHz/te5Id6P53AmG30+6dnofYyroM1l4V0YJFObsf/\r\n" + 
			"gQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
