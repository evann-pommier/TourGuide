package com.openclassrooms.tourguide.dto;

public record NearbyAttractionDto(String attractionName, double attractionLatitude, double attractionLongitude,
                                  double userLatitude, double userLongitude, double distance, int rewardPoints) {
}