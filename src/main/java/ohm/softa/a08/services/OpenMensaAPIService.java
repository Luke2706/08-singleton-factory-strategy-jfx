package ohm.softa.a08.services;

import ohm.softa.a08.api.OpenMensaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService {

	private static OpenMensaAPIService instance;
	private final OpenMensaAPI mensaApiInstance;

	private OpenMensaAPIService(){
		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("https://openmensa.org/api/v2/")
			.build();

		mensaApiInstance = retrofit.create(OpenMensaAPI.class);

	}

	public static OpenMensaAPIService getInstance(){
		if(instance == null){
			return new OpenMensaAPIService();
		}
		return instance;
	}

	public OpenMensaAPI getApi(){
		return mensaApiInstance;
	}
}
