var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "40064",
        "ok": "34341",
        "ko": "5723"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "121"
    },
    "maxResponseTime": {
        "total": "12371",
        "ok": "12371",
        "ko": "8703"
    },
    "meanResponseTime": {
        "total": "954",
        "ok": "514",
        "ko": "3592"
    },
    "standardDeviation": {
        "total": "1692",
        "ok": "1239",
        "ko": "1645"
    },
    "percentiles1": {
        "total": "9",
        "ok": "6",
        "ko": "3017"
    },
    "percentiles2": {
        "total": "1595",
        "ok": "193",
        "ko": "4571"
    },
    "percentiles3": {
        "total": "4764",
        "ok": "3126",
        "ko": "7066"
    },
    "percentiles4": {
        "total": "7127",
        "ok": "6169",
        "ko": "7987"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 28590,
    "percentage": 71
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 706,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 5045,
    "percentage": 13
},
    "group4": {
    "name": "failed",
    "count": 5723,
    "percentage": 14
},
    "meanNumberOfRequestsPerSecond": {
        "total": "101.685",
        "ok": "87.16",
        "ko": "14.525"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "20032",
        "ok": "15920",
        "ko": "4112"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "121"
    },
    "maxResponseTime": {
        "total": "12371",
        "ok": "12371",
        "ko": "8703"
    },
    "meanResponseTime": {
        "total": "1116",
        "ok": "571",
        "ko": "3226"
    },
    "standardDeviation": {
        "total": "1628",
        "ok": "1175",
        "ko": "1402"
    },
    "percentiles1": {
        "total": "122",
        "ok": "10",
        "ko": "2545"
    },
    "percentiles2": {
        "total": "2123",
        "ok": "509",
        "ko": "3974"
    },
    "percentiles3": {
        "total": "4576",
        "ok": "2945",
        "ko": "6140"
    },
    "percentiles4": {
        "total": "6945",
        "ok": "5340",
        "ko": "7732"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 12733,
    "percentage": 64
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 467,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2720,
    "percentage": 14
},
    "group4": {
    "name": "failed",
    "count": 4112,
    "percentage": 21
},
    "meanNumberOfRequestsPerSecond": {
        "total": "50.843",
        "ok": "40.406",
        "ko": "10.437"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "20032",
        "ok": "18421",
        "ko": "1611"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2014"
    },
    "maxResponseTime": {
        "total": "12371",
        "ok": "12371",
        "ko": "8684"
    },
    "meanResponseTime": {
        "total": "791",
        "ok": "464",
        "ko": "4526"
    },
    "standardDeviation": {
        "total": "1739",
        "ok": "1290",
        "ko": "1839"
    },
    "percentiles1": {
        "total": "4",
        "ok": "3",
        "ko": "4319"
    },
    "percentiles2": {
        "total": "169",
        "ok": "24",
        "ko": "6025"
    },
    "percentiles3": {
        "total": "5122",
        "ok": "3335",
        "ko": "7738"
    },
    "percentiles4": {
        "total": "7598",
        "ok": "6736",
        "ko": "8198"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 15857,
    "percentage": 79
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 239,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2325,
    "percentage": 12
},
    "group4": {
    "name": "failed",
    "count": 1611,
    "percentage": 8
},
    "meanNumberOfRequestsPerSecond": {
        "total": "50.843",
        "ok": "46.754",
        "ko": "4.089"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
