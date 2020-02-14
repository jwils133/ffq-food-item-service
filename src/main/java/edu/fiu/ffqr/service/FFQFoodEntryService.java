package edu.fiu.ffqr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.fiu.ffqr.models.FoodItem;
import edu.fiu.ffqr.models.FoodType;
import edu.fiu.ffqr.models.ServingOptions;
import edu.fiu.ffqr.models.SugarSetting;
import edu.fiu.ffqr.repositories.FFQFoodEntryRepository;;

@Service
@Component
public class FFQFoodEntryService {

	@Autowired
	private FFQFoodEntryRepository foodRepository;
	
	public List<FoodItem> getAll()	{
		return foodRepository.findAll();
	}
	
	public FoodItem getEntryWithName(String name) {
		return foodRepository.findByName(name);
	}
	
	public FoodItem getFoodItemBy_id(ObjectId _id) {
		return foodRepository.getFoodItemBy_id(_id);
	}
	
	public FoodItem getEntryWithNutrientListID(String nutrientListID) {
		return foodRepository.findByNutrientId(nutrientListID);
	}
	
	public FoodItem create(FoodItem fi) {
		return foodRepository.save(fi);
	}
	
	//public FoodItem create(String name, ArrayList<FoodType> foodTypes) { 
		// FoodItem fi = new FoodItem(name, foodTypes);
		// return foodRepository.save(fi); 
	 //}
	
	//public FoodItem create(String name, ArrayList<ServingOptions> servings, ArrayList<FoodType> foodTypes) { 
		 //FoodItem fi = new FoodItem(name, servings, foodTypes);
		 //return foodRepository.save(fi); 
	 //}
	
	//public FoodItem create(String name, ArrayList<ServingOptions> servings, ArrayList<FoodType> foodTypes, SugarSetting additionalSugar) { 
		 //FoodItem fi = new FoodItem(name, servings, foodTypes, additionalSugar);
		 //return foodRepository.save(fi); 
	 //}
	
	//public FoodItem create(String name, ArrayList<FoodType> foodTypes, SugarSetting additionalSugar) { 
		 //FoodItem fi = new FoodItem(name, foodTypes, additionalSugar);
		 //return foodRepository.save(fi); 
	 //}
	
	public void delete(String name) {
		FoodItem fi = foodRepository.findByName(name);
		foodRepository.delete(fi);
	}

	public void deleteById(ObjectId id) {
		FoodItem fi = foodRepository.getFoodItemBy_id(id);
		foodRepository.delete(fi);
	}
	
}
