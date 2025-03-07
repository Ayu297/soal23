import axios from "axios";

const API_URL = "http://localhost:8080/api";

export const fetchNegara = async () => {
  return axios.get(`${API_URL}/negara`);
};

export const fetchProvinsiByNegara = async (negaraId) => {
  return axios.get(`${API_URL}/provinsi/by-negara/${negaraId}`);
};

export const fetchKotaByProvinsi = async (provinsiId) => {
  return axios.get(`${API_URL}/kota/by-provinsi/${provinsiId}`);
};
